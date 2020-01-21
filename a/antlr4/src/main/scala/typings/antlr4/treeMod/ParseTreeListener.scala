package typings.antlr4.treeMod

import typings.antlr4.parserRuleContextMod.ParserRuleContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: ParserRuleContext): Unit
  def exitEveryRule(node: ParserRuleContext): Unit
  def visitErrorNode(node: ErrorNode): Unit
  def visitTerminal(node: TerminalNode): Unit
}

object ParseTreeListener {
  @scala.inline
  def apply(
    enterEveryRule: ParserRuleContext => Unit,
    exitEveryRule: ParserRuleContext => Unit,
    visitErrorNode: ErrorNode => Unit,
    visitTerminal: TerminalNode => Unit
  ): ParseTreeListener = {
    val __obj = js.Dynamic.literal(enterEveryRule = js.Any.fromFunction1(enterEveryRule), exitEveryRule = js.Any.fromFunction1(exitEveryRule), visitErrorNode = js.Any.fromFunction1(visitErrorNode), visitTerminal = js.Any.fromFunction1(visitTerminal))
  
    __obj.asInstanceOf[ParseTreeListener]
  }
}

