package typings.asana.asanaMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthErrorOptions extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var error_description: js.UndefOr[String] = js.undefined
  var error_uri: js.UndefOr[String] = js.undefined
}

object OauthErrorOptions {
  @scala.inline
  def apply(error: String = null, error_description: String = null, error_uri: String = null): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (error_description != null) __obj.updateDynamic("error_description")(error_description)
    if (error_uri != null) __obj.updateDynamic("error_uri")(error_uri)
    __obj.asInstanceOf[OauthErrorOptions]
  }
}

