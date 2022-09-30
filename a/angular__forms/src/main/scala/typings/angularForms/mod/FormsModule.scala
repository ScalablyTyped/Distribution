package typings.angularForms.mod

import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularForms.anon.TypeofNgForm
import typings.angularForms.anon.TypeofNgModel
import typings.angularForms.anon.TypeofNgModelGroup
import typings.angularForms.anon.TypeofɵInternalFormsShare
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormsModule")
@js.native
open class FormsModule () extends StObject
/* static members */
object FormsModule {
  
  @JSImport("@angular/forms", "FormsModule")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormsModule.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormsModule, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormsModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormsModule.\u0275inj")
  @js.native
  def ɵinj: ɵɵInjectorDeclaration[FormsModule] = js.native
  inline def ɵinj_=(x: ɵɵInjectorDeclaration[FormsModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormsModule.\u0275mod")
  @js.native
  def ɵmod: ɵɵNgModuleDeclaration[
    FormsModule, 
    js.Tuple3[TypeofNgModel, TypeofNgModelGroup, TypeofNgForm], 
    scala.Nothing, 
    js.Tuple4[TypeofɵInternalFormsShare, TypeofNgModel, TypeofNgModelGroup, TypeofNgForm]
  ] = js.native
  inline def ɵmod_=(
    x: ɵɵNgModuleDeclaration[
      FormsModule, 
      js.Tuple3[TypeofNgModel, TypeofNgModelGroup, TypeofNgForm], 
      scala.Nothing, 
      js.Tuple4[TypeofɵInternalFormsShare, TypeofNgModel, TypeofNgModelGroup, TypeofNgForm]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
}
