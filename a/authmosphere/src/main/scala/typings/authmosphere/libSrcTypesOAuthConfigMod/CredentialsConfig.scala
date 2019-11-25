package typings.authmosphere.libSrcTypesOAuthConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.authmosphere.libSrcTypesOAuthConfigMod.CredentialsDirConfig
  - typings.authmosphere.libSrcTypesOAuthConfigMod.CredentialsClientConfig
*/
trait CredentialsConfig extends js.Object

object CredentialsConfig {
  @scala.inline
  def CredentialsDirConfig(credentialsDir: String): CredentialsConfig = {
    val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsConfig]
  }
  @scala.inline
  def CredentialsClientConfig(clientId: String, clientSecret: String): CredentialsConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsConfig]
  }
}

