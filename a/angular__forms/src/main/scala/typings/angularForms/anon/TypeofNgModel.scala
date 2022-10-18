package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.angularCore.mod.ChangeDetectorRef
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngModel
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.ControlContainer
import typings.angularForms.mod.ControlValueAccessor
import typings.angularForms.mod.NgModel
import typings.angularForms.mod.Validator
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgModel
  extends StObject
     with Instantiable4[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      NgModel
    ]
     with Instantiable5[
      /* parent */ ControlContainer, 
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      /* _changeDetectorRef */ ChangeDetectorRef, 
      NgModel
    ] {
  
  /** @nodoc */
  var ngAcceptInputType_isDisabled: Boolean | String = js.native
  
  var ɵdir: ɵɵDirectiveDeclaration[
    NgModel, 
    /* [ngModel]:not([formControlName]):not([formControl]) */ String, 
    js.Array[ngModel], 
    Model, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[NgModel, js.Tuple5[HostOptional, Self, Self, Self, Optional]] = js.native
}
