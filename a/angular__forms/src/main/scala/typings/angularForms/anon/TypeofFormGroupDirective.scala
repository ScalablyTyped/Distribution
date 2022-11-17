package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.FormGroupDirective
import typings.angularForms.mod.SetDisabledStateOption
import typings.angularForms.mod.Validator
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofFormGroupDirective
  extends StObject
     with Instantiable2[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      FormGroupDirective
    ]
     with Instantiable3[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      /* callSetDisabledState */ SetDisabledStateOption, 
      FormGroupDirective
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    FormGroupDirective, 
    "[formGroup]", 
    js.Array["ngForm"], 
    `1`, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    false, 
    scala.Nothing
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[FormGroupDirective, js.Tuple3[Self, Self, Optional]] = js.native
}
