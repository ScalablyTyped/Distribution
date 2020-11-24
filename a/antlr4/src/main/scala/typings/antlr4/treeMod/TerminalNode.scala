package typings.antlr4.treeMod

import typings.antlr4.intervalSetMod.Interval
import typings.antlr4.tokenMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antlr4/tree/Tree", "TerminalNode")
@js.native
class TerminalNode protected () extends ParseTree {
  def this(symbol: Token) = this()
  
  def accept(visitor: ParseTreeVisitor): js.Any = js.native
  
  def getChild(i: Double): js.Any = js.native
  
  def getChildCount(): Double = js.native
  
  def getParent(): js.Any = js.native
  
  def getPayload(): Token = js.native
  
  def getSourceInterval(): Interval = js.native
  
  def getSymbol(): Token = js.native
  
  def getText(): String = js.native
  
  val parentCtx: js.Any = js.native
  
  val symbol: Token = js.native
}
