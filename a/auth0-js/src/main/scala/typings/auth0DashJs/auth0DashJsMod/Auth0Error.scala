package typings.auth0DashJs.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Error extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var error: LibErrorCodes | SpecErrorCodes | String
  var errorDescription: js.UndefOr[String] = js.undefined
  // Auth0 is not consistent in the naming of the error description field
  var error_description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var original: js.UndefOr[js.Any] = js.undefined
  var policy: js.UndefOr[String] = js.undefined
  var statusCode: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object Auth0Error {
  @scala.inline
  def apply(
    error: LibErrorCodes | SpecErrorCodes | String,
    code: String = null,
    description: String = null,
    errorDescription: String = null,
    error_description: String = null,
    name: String = null,
    original: js.Any = null,
    policy: String = null,
    statusCode: Int | Double = null,
    statusText: String = null
  ): Auth0Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (errorDescription != null) __obj.updateDynamic("errorDescription")(errorDescription)
    if (error_description != null) __obj.updateDynamic("error_description")(error_description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (original != null) __obj.updateDynamic("original")(original)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Auth0Error]
  }
}

