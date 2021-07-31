package typings.angularCompiler.compilerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/compiler/compiler", "CssSelector")
@js.native
class CssSelector ()
  extends typings.angularCompiler.publicApiMod.CssSelector
/* static members */
object CssSelector {
  
  @JSImport("@angular/compiler/compiler", "CssSelector")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def parse(selector: String): js.Array[typings.angularCompiler.selectorMod.CssSelector] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[typings.angularCompiler.selectorMod.CssSelector]]
}
