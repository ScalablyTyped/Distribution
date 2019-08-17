package typings.atAngularForms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularFormsMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.rxjs.rxjsMod.Observable

  type AsyncValidatorFn = js.Function1[
    /* control */ AbstractControl, 
    (js.Promise[ValidationErrors | Null]) | (Observable[ValidationErrors | Null])
  ]
  type ValidationErrors = StringDictionary[js.Any]
  type ValidatorFn = js.Function1[/* control */ AbstractControl, ValidationErrors | Null]
}
