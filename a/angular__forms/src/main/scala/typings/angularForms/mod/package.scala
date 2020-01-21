package typings.angularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AsyncValidatorFn = js.Function1[
    /* control */ typings.angularForms.mod.AbstractControl, 
    (js.Promise[typings.angularForms.mod.ValidationErrors | scala.Null]) | (typings.rxjs.mod.Observable_[typings.angularForms.mod.ValidationErrors | scala.Null])
  ]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValidatorFn = js.Function1[
    /* control */ typings.angularForms.mod.AbstractControl, 
    typings.angularForms.mod.ValidationErrors | scala.Null
  ]
}
