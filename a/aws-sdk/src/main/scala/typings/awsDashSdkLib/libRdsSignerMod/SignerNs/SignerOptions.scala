package typings
package awsDashSdkLib.libRdsSignerMod.SignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerOptions extends js.Object {
  var credentials: js.UndefOr[
    awsDashSdkLib.libCredentialsMod.Credentials | awsDashSdkLib.libCredentialsMod.CredentialsOptions
  ] = js.undefined
  var hostname: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var username: js.UndefOr[java.lang.String] = js.undefined
}

object SignerOptions {
  @scala.inline
  def apply(
    credentials: awsDashSdkLib.libCredentialsMod.Credentials | awsDashSdkLib.libCredentialsMod.CredentialsOptions = null,
    hostname: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    region: java.lang.String = null,
    username: java.lang.String = null
  ): SignerOptions = {
    val __obj = js.Dynamic.literal()
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region)
    if (username != null) __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[SignerOptions]
  }
}

