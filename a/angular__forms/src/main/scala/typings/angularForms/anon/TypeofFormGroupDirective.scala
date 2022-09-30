package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.`[formGroup]`
import typings.angularForms.angularFormsStrings.ngForm
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.FormGroupDirective
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
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    FormGroupDirective, 
    `[formGroup]`, 
    js.Array[ngForm], 
    `1`, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[FormGroupDirective, js.Tuple2[Self, Self]] = js.native
}
