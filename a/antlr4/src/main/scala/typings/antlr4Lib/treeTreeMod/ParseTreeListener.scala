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
    val __obj = js.Dynamic.literal(enterEveryRule = enterEveryRule, exitEveryRule = exitEveryRule, visitErrorNode = visitErrorNode, visitTerminal = visitTerminal)
  
    __obj.asInstanceOf[ParseTreeListener]
  }
}

