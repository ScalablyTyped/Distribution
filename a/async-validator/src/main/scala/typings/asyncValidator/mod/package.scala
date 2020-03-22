package typings.asyncValidator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ErrorList = js.Array[typings.asyncValidator.mod.ValidateError]
  type FieldErrorList = org.scalablytyped.runtime.StringDictionary[js.Array[typings.asyncValidator.mod.ValidateError]]
  type Rules = org.scalablytyped.runtime.StringDictionary[
    typings.asyncValidator.mod.RuleItem | js.Array[typings.asyncValidator.mod.RuleItem]
  ]
  type ValidateSource = org.scalablytyped.runtime.StringDictionary[js.Any]
}
