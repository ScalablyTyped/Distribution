package typings.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsUserConfig extends js.Object {
  var applicationPassword: String
  var applicationUsername: String
}

object CredentialsUserConfig {
  @scala.inline
  def apply(applicationPassword: String, applicationUsername: String): CredentialsUserConfig = {
    val __obj = js.Dynamic.literal(applicationPassword = applicationPassword.asInstanceOf[js.Any], applicationUsername = applicationUsername.asInstanceOf[js.Any])
    __obj.asInstanceOf[CredentialsUserConfig]
  }
}

