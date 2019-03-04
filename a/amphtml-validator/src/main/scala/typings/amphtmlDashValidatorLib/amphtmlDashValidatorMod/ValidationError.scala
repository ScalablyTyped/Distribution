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

object ValidationError {
  @scala.inline
  def apply(
    category: ErrorCategoryCode,
    code: ValidationErrorCode,
    col: scala.Double,
    line: scala.Double,
    message: java.lang.String,
    params: js.Array[java.lang.String],
    severity: ValidationErrorSeverity,
    specUrl: java.lang.String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(category = category, code = code, col = col, line = line, message = message, params = params, severity = severity)
    if (specUrl != null) __obj.updateDynamic("specUrl")(specUrl)
    __obj.asInstanceOf[ValidationError]
  }
}

