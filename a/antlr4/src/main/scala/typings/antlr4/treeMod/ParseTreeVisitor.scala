package typings.antlr4.treeMod

import typings.antlr4.parserRuleContextMod.ParserRuleContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/tree/Tree", "ParseTreeVisitor")
@js.native
class ParseTreeVisitor () extends js.Object {
  def visit(ctx: ParserRuleContext): js.Any = js.native
  def visitChildren(ctx: ParserRuleContext): js.Any = js.native
  def visitErrorNode(node: ErrorNode): js.Any = js.native
  def visitTerminal(node: TerminalNode): js.Any = js.native
}

