package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A customizable error type that you create to indicate problems with the address or contact information on an Apple Pay sheet.
  */
@js.native
trait ApplePayError extends js.Object {
  /**
    * The error code for this instance.
    */
  var code: ApplePayErrorCode = js.native
  /**
    * The name of the field that contains the error.
    */
  var contactField: js.UndefOr[ApplePayErrorContactField] = js.native
  /**
    * A localized, user-facing string that describes the error.
    */
  var message: String = js.native
}

object ApplePayError {
  @scala.inline
  def apply(code: ApplePayErrorCode, message: String): ApplePayError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplePayError]
  }
  @scala.inline
  implicit class ApplePayErrorOps[Self <: ApplePayError] (val x: Self) extends AnyVal {
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
    def setCode(value: ApplePayErrorCode): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setContactField(value: ApplePayErrorContactField): Self = this.set("contactField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContactField: Self = this.set("contactField", js.undefined)
  }
  
}

