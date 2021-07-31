package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "SelectorMatcher")
@js.native
class SelectorMatcher[T] ()
  extends typings.angularCompiler.publicApiMod.SelectorMatcher[T]
/* static members */
object SelectorMatcher {
  
  @JSImport("@angular/compiler/compiler", "SelectorMatcher")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def createNotMatcher(notSelectors: js.Array[typings.angularCompiler.selectorMod.CssSelector]): typings.angularCompiler.selectorMod.SelectorMatcher[Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("createNotMatcher")(notSelectors.asInstanceOf[js.Any]).asInstanceOf[typings.angularCompiler.selectorMod.SelectorMatcher[Null]]
}
