package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth0Error extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var error: LibErrorCodes | SpecErrorCodes | String = js.native
  var errorDescription: js.UndefOr[String] = js.native
  // Auth0 is not consistent in the naming of the error description field
  var error_description: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var original: js.UndefOr[js.Any] = js.native
  var policy: js.UndefOr[String] = js.native
  var statusCode: js.UndefOr[Double] = js.native
  var statusText: js.UndefOr[String] = js.native
}

object Auth0Error {
  @scala.inline
  def apply(error: LibErrorCodes | SpecErrorCodes | String): Auth0Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[Auth0Error]
  }
  @scala.inline
  implicit class Auth0ErrorOps[Self <: Auth0Error] (val x: Self) extends AnyVal {
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
    def setError(value: LibErrorCodes | SpecErrorCodes | String): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: String): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("code", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setErrorDescription(value: String): Self = this.set("errorDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorDescription: Self = this.set("errorDescription", js.undefined)
    @scala.inline
    def setError_description(value: String): Self = this.set("error_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError_description: Self = this.set("error_description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOriginal(value: js.Any): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
    @scala.inline
    def setStatusText(value: String): Self = this.set("statusText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusText: Self = this.set("statusText", js.undefined)
  }
  
}

