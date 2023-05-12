package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import org.scalablytyped.runtime.Instantiable5
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.`[formControl]`
import typings.angularForms.angularFormsStrings.ngForm
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.ControlValueAccessor
import typings.angularForms.mod.FormControlDirective
import typings.angularForms.mod.SetDisabledStateOption
import typings.angularForms.mod.Validator
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormControlDirectiv
  extends StObject
     with Instantiable3[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      FormControlDirective
    ]
     with Instantiable4[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      /* _ngModelWarningConfig */ String, 
      FormControlDirective
    ]
     with Instantiable5[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* valueAccessors */ js.Array[ControlValueAccessor], 
      (/* _ngModelWarningConfig */ Null) | (/* _ngModelWarningConfig */ String), 
      /* callSetDisabledState */ SetDisabledStateOption, 
      FormControlDirective
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    FormControlDirective, 
    `[formControl]`, 
    js.Array[ngForm], 
    Form, 
    Update, 
    scala.Nothing, 
    scala.Nothing, 
    `false`, 
    scala.Nothing
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[FormControlDirective, js.Tuple5[Self, Self, Self, Optional, Optional]] = js.native
}
