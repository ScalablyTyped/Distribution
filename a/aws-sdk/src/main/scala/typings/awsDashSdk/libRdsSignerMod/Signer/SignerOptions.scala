package typings.awsDashSdk.libRdsSignerMod.Signer

import typings.awsDashSdk.libCredentialsMod.Credentials
import typings.awsDashSdk.libCredentialsMod.CredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignerOptions extends js.Object {
  var credentials: js.UndefOr[Credentials | CredentialsOptions] = js.native
  var hostname: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  var region: js.UndefOr[String] = js.native
  var username: js.UndefOr[String] = js.native
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
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignerOptions]
  }
}

