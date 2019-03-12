package typings
package antlr4Lib.treeTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/tree/Tree", "TerminalNode")
@js.native
class TerminalNode protected () extends ParseTree {
  def this(symbol: antlr4Lib.tokenMod.Token) = this()
  val parentCtx: js.Any = js.native
  val symbol: antlr4Lib.tokenMod.Token = js.native
  def accept(visitor: ParseTreeVisitor): js.Any = js.native
  def getChild(i: scala.Double): js.Any = js.native
  def getChildCount(): scala.Double = js.native
  def getParent(): js.Any = js.native
  def getPayload(): antlr4Lib.tokenMod.Token = js.native
  def getSourceInterval(): antlr4Lib.intervalSetMod.Interval = js.native
  def getSymbol(): antlr4Lib.tokenMod.Token = js.native
  def getText(): java.lang.String = js.native
}

