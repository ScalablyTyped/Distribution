package typings.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CredentialsClientConfig extends CredentialsConfig {
  var clientId: String = js.native
  var clientSecret: String = js.native
}

object CredentialsClientConfig {
  @scala.inline
  def apply(clientId: String, clientSecret: String): CredentialsClientConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsClientConfig]
  }
  @scala.inline
  implicit class CredentialsClientConfigOps[Self <: CredentialsClientConfig] (val x: Self) extends AnyVal {
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
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
  }
  
}

