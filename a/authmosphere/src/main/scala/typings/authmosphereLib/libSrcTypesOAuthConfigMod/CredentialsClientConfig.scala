package typings
package authmosphereLib.libSrcTypesOAuthConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsClientConfig extends CredentialsConfig {
  var clientId: java.lang.String
  var clientSecret: java.lang.String
}

object CredentialsClientConfig {
  @scala.inline
  def apply(clientId: java.lang.String, clientSecret: java.lang.String): CredentialsClientConfig = {
    val __obj = js.Dynamic.literal(clientId = clientId, clientSecret = clientSecret)
  
    __obj.asInstanceOf[CredentialsClientConfig]
  }
}

