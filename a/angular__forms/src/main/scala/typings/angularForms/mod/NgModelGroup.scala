package typings.angularForms.mod

import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.anon.Self
import typings.angularForms.anon.SkipSelf
import typings.angularForms.anon.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "NgModelGroup")
@js.native
open class NgModelGroup protected () extends AbstractFormGroupDirective {
  def this(
    parent: ControlContainer,
    validators: js.Array[Validator | ValidatorFn],
    asyncValidators: js.Array[AsyncValidator | AsyncValidatorFn]
  ) = this()
  
  /**
    * @description
    * Tracks the name of the `NgModelGroup` bound to the directive. The name corresponds
    * to a key in the parent `NgForm`.
    */
  @JSName("name")
  var name_NgModelGroup: String = js.native
}
/* static members */
object NgModelGroup {
  
  @JSImport("@angular/forms", "NgModelGroup")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "NgModelGroup.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    NgModelGroup, 
    "[ngModelGroup]", 
    js.Array["ngModelGroup"], 
    `3`, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      NgModelGroup, 
      "[ngModelGroup]", 
      js.Array["ngModelGroup"], 
      `3`, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "NgModelGroup.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[NgModelGroup, js.Tuple3[SkipSelf, Self, Self]] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[NgModelGroup, js.Tuple3[SkipSelf, Self, Self]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
