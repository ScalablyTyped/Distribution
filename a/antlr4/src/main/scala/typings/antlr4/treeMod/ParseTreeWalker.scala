package typings.antlr4.treeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("antlr4/tree/Tree", "ParseTreeWalker")
@js.native
class ParseTreeWalker () extends js.Object {
  def enterRule(listener: ParseTreeListener, rule: js.Any): Unit = js.native
  def exitRule(listener: ParseTreeListener, rule: js.Any): Unit = js.native
  def walk(listener: ParseTreeListener, rule: js.Any): Unit = js.native
}

/* static members */
@JSImport("antlr4/tree/Tree", "ParseTreeWalker")
@js.native
object ParseTreeWalker extends js.Object {
  val DEFAULT: ParseTreeWalker = js.native
}

