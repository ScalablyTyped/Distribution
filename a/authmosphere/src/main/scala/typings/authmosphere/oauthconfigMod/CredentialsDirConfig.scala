package typings.authmosphere.oauthconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsDirConfig extends CredentialsConfig {
  var credentialsDir: String
}

object CredentialsDirConfig {
  @scala.inline
  def apply(credentialsDir: String): CredentialsDirConfig = {
    val __obj = js.Dynamic.literal(credentialsDir = credentialsDir.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CredentialsDirConfig]
  }
}

