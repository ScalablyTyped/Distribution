package typings.antlr4.treeMod

import typings.antlr4.parserRuleContextMod.ParserRuleContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseTreeListener extends js.Object {
  def enterEveryRule(node: ParserRuleContext): Unit = js.native
  def exitEveryRule(node: ParserRuleContext): Unit = js.native
  def visitErrorNode(node: ErrorNode): Unit = js.native
  def visitTerminal(node: TerminalNode): Unit = js.native
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
  @scala.inline
  implicit class ParseTreeListenerOps[Self <: ParseTreeListener] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEnterEveryRule(value: ParserRuleContext => Unit): Self = this.set("enterEveryRule", js.Any.fromFunction1(value))
    @scala.inline
    def setExitEveryRule(value: ParserRuleContext => Unit): Self = this.set("exitEveryRule", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitErrorNode(value: ErrorNode => Unit): Self = this.set("visitErrorNode", js.Any.fromFunction1(value))
    @scala.inline
    def setVisitTerminal(value: TerminalNode => Unit): Self = this.set("visitTerminal", js.Any.fromFunction1(value))
  }
  
}

