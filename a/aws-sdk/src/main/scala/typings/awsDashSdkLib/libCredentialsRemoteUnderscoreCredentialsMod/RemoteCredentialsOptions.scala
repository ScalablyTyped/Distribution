package typings
package awsDashSdkLib.libCredentialsRemoteUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoteCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[awsDashSdkLib.Anon_Timeout] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
}

object RemoteCredentialsOptions {
  @scala.inline
  def apply(httpOptions: awsDashSdkLib.Anon_Timeout = null, maxRetries: scala.Int | scala.Double = null): RemoteCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteCredentialsOptions]
  }
}

