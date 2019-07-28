package typings.antlr4.treeTreeMod

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/tree/Tree", "TerminalNode")
@js.native
class TerminalNode protected () extends ParseTree {
  def this(symbol: Token) = this()
  val parentCtx: js.Any = js.native
  val symbol: Token = js.native
  def accept(visitor: ParseTreeVisitor): js.Any = js.native
  def getChild(i: Double): js.Any = js.native
  def getChildCount(): Double = js.native
  def getParent(): js.Any = js.native
  def getPayload(): Token = js.native
  def getSourceInterval(): Interval = js.native
  def getSymbol(): Token = js.native
  def getText(): String = js.native
}

