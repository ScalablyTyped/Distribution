package typings.angularForms.mod

import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.anon.Host
import typings.angularForms.anon.Self
import typings.angularForms.anon.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "FormGroupName")
@js.native
open class FormGroupName protected () extends AbstractFormGroupDirective {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
}
/* static members */
object FormGroupName {
  
  @JSImport("@angular/forms", "FormGroupName")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "FormGroupName.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    FormGroupName, 
    "[formGroupName]", 
    scala.Nothing, 
    `2`, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      FormGroupName, 
      "[formGroupName]", 
      scala.Nothing, 
      `2`, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "FormGroupName.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[FormGroupName, js.Tuple3[Host, Self, Self]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[FormGroupName, js.Tuple3[Host, Self, Self]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
