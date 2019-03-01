package typings
package asanaLib.asanaMod.asanaNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsanaAuthorizeUrlOptions extends js.Object {
  var asanaBaseUrl: js.UndefOr[java.lang.String] = js.undefined
  var redirectUri: js.UndefOr[java.lang.String] = js.undefined
}

object AsanaAuthorizeUrlOptions {
  @scala.inline
  def apply(asanaBaseUrl: java.lang.String = null, redirectUri: java.lang.String = null): AsanaAuthorizeUrlOptions = {
    val __obj = js.Dynamic.literal()
    if (asanaBaseUrl != null) __obj.updateDynamic("asanaBaseUrl")(asanaBaseUrl)
    if (redirectUri != null) __obj.updateDynamic("redirectUri")(redirectUri)
    __obj.asInstanceOf[AsanaAuthorizeUrlOptions]
  }
}

