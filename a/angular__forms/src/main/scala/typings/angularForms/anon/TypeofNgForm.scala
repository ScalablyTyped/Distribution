package typings.angularForms.anon

import org.scalablytyped.runtime.Instantiable2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularForms.angularFormsBooleans.`false`
import typings.angularForms.angularFormsStrings.ngForm
import typings.angularForms.mod.AsyncValidator
import typings.angularForms.mod.AsyncValidatorFn
import typings.angularForms.mod.NgForm
import typings.angularForms.mod.Validator
import typings.angularForms.mod.ValidatorFn
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofNgForm
  extends StObject
     with Instantiable2[
      /* validators */ js.Array[Validator | ValidatorFn], 
      /* asyncValidators */ js.Array[AsyncValidator | AsyncValidatorFn], 
      NgForm
    ] {
  
  var ɵdir: ɵɵDirectiveDeclaration[
    NgForm, 
    /* form:not([ngNoForm]):not([formGroup]),ng-form,[ngForm] */ String, 
    js.Array[ngForm], 
    Options, 
    NgSubmit, 
    scala.Nothing, 
    scala.Nothing, 
    `false`
  ] = js.native
  
  var ɵfac: ɵɵFactoryDeclaration[NgForm, js.Tuple2[Self, Self]] = js.native
}
