package typings.awsDashSdk.libRdsSignerMod.Signer

import typings.awsDashSdk.libCredentialsMod.Credentials
import typings.awsDashSdk.libCredentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignerOptions extends js.Object {
  var credentials: js.UndefOr[Credentials | CredentialsOptions] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var username: js.UndefOr[String] = js.undefined
}

object SignerOptions {
  @scala.inline
  def apply(
    credentials: Credentials | CredentialsOptions = null,
    hostname: String = null,
    port: Int | Double = null,
    region: String = null,
    username: String = null
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

