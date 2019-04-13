package typings
package atAngularFormsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object srcDirectivesValidatorsMod {
  type AsyncValidatorFn = js.Function1[
    /* control */ atAngularFormsLib.srcModelMod.AbstractControl, 
    (js.Promise[ValidationErrors | scala.Null]) | (rxjsLib.rxjsMod.Observable[ValidationErrors | scala.Null])
  ]
  type ValidationErrors = org.scalablytyped.runtime.StringDictionary[js.Any]
  type ValidatorFn = js.Function1[
    /* control */ atAngularFormsLib.srcModelMod.AbstractControl, 
    ValidationErrors | scala.Null
  ]
}
