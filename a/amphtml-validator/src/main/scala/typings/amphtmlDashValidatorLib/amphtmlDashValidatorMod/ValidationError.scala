package typings
package amphtmlDashValidatorLib.amphtmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var category: ErrorCategoryCode
  var code: ValidationErrorCode
  var col: scala.Double
  var line: scala.Double
  var message: java.lang.String
  var params: js.Array[java.lang.String]
  var severity: ValidationErrorSeverity
  var specUrl: java.lang.String | scala.Null
}

