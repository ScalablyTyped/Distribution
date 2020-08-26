package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestValidator extends js.Object {
  /**
    * The identifier of this RequestValidator.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name of this RequestValidator
    */
  var name: js.UndefOr[String] = js.native
  /**
    * A Boolean flag to indicate whether to validate a request body according to the configured Model schema.
    */
  var validateRequestBody: js.UndefOr[Boolean] = js.native
  /**
    * A Boolean flag to indicate whether to validate request parameters (true) or not (false).
    */
  var validateRequestParameters: js.UndefOr[Boolean] = js.native
}

object RequestValidator {
  @scala.inline
  def apply(): RequestValidator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestValidator]
  }
  @scala.inline
  implicit class RequestValidatorOps[Self <: RequestValidator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setValidateRequestBody(value: Boolean): Self = this.set("validateRequestBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateRequestBody: Self = this.set("validateRequestBody", js.undefined)
    @scala.inline
    def setValidateRequestParameters(value: Boolean): Self = this.set("validateRequestParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateRequestParameters: Self = this.set("validateRequestParameters", js.undefined)
  }
  
}

