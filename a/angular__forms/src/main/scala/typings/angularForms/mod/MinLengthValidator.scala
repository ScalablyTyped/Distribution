package typings.angularForms.mod

import typings.angularCore.mod.SimpleChanges
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.anon.Minlength
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/forms", "MinLengthValidator")
@js.native
open class MinLengthValidator ()
  extends StObject
     with AbstractValidatorDirective {
  
  /* private */ /* CompleteClass */
  var _onChange: Any = js.native
  
  /* private */ /* CompleteClass */
  var _validator: Any = js.native
  
  /**
    * @description
    * Determines whether this validator should be active or not based on an input.
    * Base class implementation checks whether an input is defined (if the value is different from
    * `null` and `undefined`). Validator classes that extend this base class can override this
    * function with the logic specific to a particular validator directive.
    */
  /* CompleteClass */
  override def enabled(input: Any): Boolean = js.native
  
  /**
    * @description
    * Tracks changes to the minimum length bound to this directive.
    */
  var minlength: String | Double | Null = js.native
  
  /**
    * A callback method that is invoked immediately after the
    * default change detector has checked data-bound properties
    * if at least one has changed, and before the view and content
    * children are checked.
    * @param changes The changed properties.
    */
  /* CompleteClass */
  override def ngOnChanges(changes: SimpleChanges): Unit = js.native
  
  /** @nodoc */
  /* CompleteClass */
  @JSName("registerOnValidatorChange")
  override def registerOnValidatorChange_MAbstractValidatorDirective(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * @description
    * Method that performs synchronous validation against the provided control.
    *
    * @param control The control to validate against.
    *
    * @returns A map of validation errors if validation fails,
    * otherwise null.
    */
  /* CompleteClass */
  override def validate(control: AbstractControl[Any, Any]): ValidationErrors | Null = js.native
}
/* static members */
object MinLengthValidator {
  
  @JSImport("@angular/forms", "MinLengthValidator")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/forms", "MinLengthValidator.\u0275dir")
  @js.native
  def ɵdir: ɵɵDirectiveDeclaration[
    MinLengthValidator, 
    /* [minlength][formControlName],[minlength][formControl],[minlength][ngModel] */ String, 
    scala.Nothing, 
    Minlength, 
    js.Object, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  inline def ɵdir_=(
    x: ɵɵDirectiveDeclaration[
      MinLengthValidator, 
      /* [minlength][formControlName],[minlength][formControl],[minlength][ngModel] */ String, 
      scala.Nothing, 
      Minlength, 
      js.Object, 
      scala.Nothing, 
      scala.Nothing, 
      false, 
      scala.Nothing
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
  
  @JSImport("@angular/forms", "MinLengthValidator.\u0275fac")
  @js.native
  def ɵfac: ɵɵFactoryDeclaration[MinLengthValidator, scala.Nothing] = js.native
  inline def ɵfac_=(x: ɵɵFactoryDeclaration[MinLengthValidator, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
}
