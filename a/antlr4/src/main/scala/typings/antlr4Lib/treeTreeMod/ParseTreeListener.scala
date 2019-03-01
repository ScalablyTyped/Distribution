package typings
package antlr4Lib.treeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: antlr4Lib.parserrulecontextMod.ParserRuleContext): scala.Unit
  def exitEveryRule(node: antlr4Lib.parserrulecontextMod.ParserRuleContext): scala.Unit
  def visitErrorNode(node: ErrorNode): scala.Unit
  def visitTerminal(node: TerminalNode): scala.Unit
}

object ParseTreeListener {
  @scala.inline
  def apply(
    enterEveryRule: js.Function1[antlr4Lib.parserrulecontextMod.ParserRuleContext, scala.Unit],
    exitEveryRule: js.Function1[antlr4Lib.parserrulecontextMod.ParserRuleContext, scala.Unit],
    visitErrorNode: js.Function1[ErrorNode, scala.Unit],
    visitTerminal: js.Function1[TerminalNode, scala.Unit]
  ): ParseTreeListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enterEveryRule")(enterEveryRule)
    __obj.updateDynamic("exitEveryRule")(exitEveryRule)
    __obj.updateDynamic("visitErrorNode")(visitErrorNode)
    __obj.updateDynamic("visitTerminal")(visitTerminal)
    __obj.asInstanceOf[ParseTreeListener]
  }
}

