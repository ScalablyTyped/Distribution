package typings.angularCompiler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler", "SelectorMatcher")
@js.native
class SelectorMatcher[T] ()
  extends typings.angularCompiler.compilerMod.SelectorMatcher[T]

/* static members */
@JSImport("@angular/compiler", "SelectorMatcher")
@js.native
object SelectorMatcher extends js.Object {
  def createNotMatcher(notSelectors: js.Array[typings.angularCompiler.selectorMod.CssSelector]): typings.angularCompiler.selectorMod.SelectorMatcher[Null] = js.native
}

