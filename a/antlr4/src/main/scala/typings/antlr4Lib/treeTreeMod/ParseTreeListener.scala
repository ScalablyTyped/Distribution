package typings
package antlr4Lib.treeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: antlr4Lib.parserRuleContextMod.ParserRuleContext): scala.Unit
  def exitEveryRule(node: antlr4Lib.parserRuleContextMod.ParserRuleContext): scala.Unit
  def visitErrorNode(node: ErrorNode): scala.Unit
  def visitTerminal(node: TerminalNode): scala.Unit
}

object ParseTreeListener {
  @scala.inline
  def apply(
    enterEveryRule: antlr4Lib.parserRuleContextMod.ParserRuleContext => scala.Unit,
    exitEveryRule: antlr4Lib.parserRuleContextMod.ParserRuleContext => scala.Unit,
    visitErrorNode: ErrorNode => scala.Unit,
    visitTerminal: TerminalNode => scala.Unit
  ): ParseTreeListener = {
    val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1(enterEveryRule), exitEveryRule = js.Any.fromFunction1(exitEveryRule), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
  
    __obj.asInstanceOf[ParseTreeListener]
  }
}

