package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OauthErrorOptions extends js.Object {
  var error: js.UndefOr[java.lang.String] = js.undefined
  var error_description: js.UndefOr[java.lang.String] = js.undefined
  var error_uri: js.UndefOr[java.lang.String] = js.undefined
}

object OauthErrorOptions {
  @scala.inline
  def apply(
    error: java.lang.String = null,
    error_description: java.lang.String = null,
    error_uri: java.lang.String = null
  ): OauthErrorOptions = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error)
    if (error_description != null) __obj.updateDynamic("error_description")(error_description)
    if (error_uri != null) __obj.updateDynamic("error_uri")(error_uri)
    __obj.asInstanceOf[OauthErrorOptions]
  }
}

