package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atAngularFormsMod {
  type AsyncValidatorFn = js.Function1[
    /* control */ AbstractControl, 
    (js.Promise[ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[ValidationErrors | scala.Null])
  ]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValidatorFn = js.Function1[/* control */ AbstractControl, ValidationErrors | scala.Null]
}
