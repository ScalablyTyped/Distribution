package typings
package auth0DashJsLib.auth0DashJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Auth0Error extends js.Object {
  // Need to include non-intuitive error fields that Auth0 uses
  var code: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var error: LibErrorCodes | SpecErrorCodes | java.lang.String
  var errorDescription: java.lang.String
  var name: js.UndefOr[java.lang.String] = js.undefined
  var original: js.UndefOr[js.Any] = js.undefined
  var policy: js.UndefOr[java.lang.String] = js.undefined
  var statusCode: js.UndefOr[scala.Double] = js.undefined
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}

object Auth0Error {
  @scala.inline
  def apply(
    error: LibErrorCodes | SpecErrorCodes | java.lang.String,
    errorDescription: java.lang.String,
    code: java.lang.String = null,
    description: java.lang.String = null,
    name: java.lang.String = null,
    original: js.Any = null,
    policy: java.lang.String = null,
    statusCode: scala.Int | scala.Double = null,
    statusText: java.lang.String = null
  ): Auth0Error = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], errorDescription = errorDescription)
    if (code != null) __obj.updateDynamic("code")(code)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (original != null) __obj.updateDynamic("original")(original)
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText)
    __obj.asInstanceOf[Auth0Error]
  }
}

