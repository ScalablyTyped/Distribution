package typings.authmosphere.libSrcTypesOAuthConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsClientConfig extends CredentialsConfig {
  var clientId: String
  var clientSecret: String
}

object CredentialsClientConfig {
  @scala.inline
  def apply(clientId: String, clientSecret: String): CredentialsClientConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsClientConfig]
  }
}

