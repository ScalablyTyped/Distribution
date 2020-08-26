package typings.amphtmlValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValidationError extends js.Object {
  var code: ValidationErrorCode = js.native
  var col: Double = js.native
  var line: Double = js.native
  var message: String = js.native
  var params: js.Array[String] = js.native
  var severity: ValidationErrorSeverity = js.native
  var specUrl: String | Null = js.native
}

object ValidationError {
  @scala.inline
  def apply(
    code: ValidationErrorCode,
    col: Double,
    line: Double,
    message: String,
    params: js.Array[String],
    severity: ValidationErrorSeverity
  ): ValidationError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationError]
  }
  @scala.inline
  implicit class ValidationErrorOps[Self <: ValidationError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: ValidationErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setCol(value: Double): Self = this.set("col", value.asInstanceOf[js.Any])
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setParamsVarargs(value: String*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverity(value: ValidationErrorSeverity): Self = this.set("severity", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecUrl(value: String): Self = this.set("specUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpecUrlNull: Self = this.set("specUrl", null)
  }
  
}

