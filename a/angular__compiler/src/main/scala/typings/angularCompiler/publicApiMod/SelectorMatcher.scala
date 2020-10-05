package typings.angularCompiler.publicApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/public_api", "SelectorMatcher")
@js.native
class SelectorMatcher[T] ()
  extends typings.angularCompiler.srcCompilerMod.SelectorMatcher[T]

/* static members */
@JSImport("@angular/compiler/public_api", "SelectorMatcher")
@js.native
object SelectorMatcher extends js.Object {
  def createNotMatcher(notSelectors: js.Array[typings.angularCompiler.selectorMod.CssSelector]): typings.angularCompiler.selectorMod.SelectorMatcher[Null] = js.native
}

