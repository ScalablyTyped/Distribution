package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationError extends js.Object {
  var code: ValidationErrorCode
  var col: Double
  var line: Double
  var message: String
  var params: js.Array[String]
  var severity: ValidationErrorSeverity
  var specUrl: String | Null
}

object ValidationError {
  @scala.inline
  def apply(
    code: ValidationErrorCode,
    col: Double,
    line: Double,
    message: String,
    params: js.Array[String],
    severity: ValidationErrorSeverity,
    specUrl: String = null
  ): ValidationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    if (specUrl != null) __obj.updateDynamic("specUrl")(specUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
}

