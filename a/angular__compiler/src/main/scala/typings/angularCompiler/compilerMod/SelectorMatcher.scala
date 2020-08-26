package typings.angularCompiler.compilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/compiler", "SelectorMatcher")
@js.native
class SelectorMatcher[T] ()
  extends typings.angularCompiler.publicApiMod.SelectorMatcher[T]

/* static members */
@JSImport("@angular/compiler/compiler", "SelectorMatcher")
@js.native
object SelectorMatcher extends js.Object {
  def createNotMatcher(notSelectors: js.Array[typings.angularCompiler.selectorMod.CssSelector]): typings.angularCompiler.selectorMod.SelectorMatcher[Null] = js.native
}

