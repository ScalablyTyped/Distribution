package typings.angularForms.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "UntypedFormBuilder")
@js.native
open class UntypedFormBuilder () extends FormBuilder {
  
  /**
    * Like `FormBuilder#group`, except the resulting group is untyped.
    */
  def group(controlsConfig: StringDictionary[Any]): typings.angularForms.mod.UntypedFormGroup = js.native
  def group(controlsConfig: StringDictionary[Any], options: AbstractControlOptions): typings.angularForms.mod.UntypedFormGroup = js.native
}
/* static members */
object UntypedFormBuilder {
  
  @JSImport("@angular/forms", "UntypedFormBuilder")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "UntypedFormBuilder.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[UntypedFormBuilder, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[UntypedFormBuilder, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "UntypedFormBuilder.\u0275prov")
  @js.native
  def ɵprov: ɵɵInjectableDeclaration[UntypedFormBuilder] = js.native
  inline def ɵprov_=(x: ɵɵInjectableDeclaration[UntypedFormBuilder]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
}
