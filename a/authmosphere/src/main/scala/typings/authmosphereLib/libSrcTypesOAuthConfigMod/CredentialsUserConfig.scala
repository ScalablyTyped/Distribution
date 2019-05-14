package typings
package authmosphereLib.libSrcTypesOAuthConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CredentialsUserConfig extends js.Object {
  var applicationPassword: java.lang.String
  var applicationUsername: java.lang.String
}

object CredentialsUserConfig {
  @scala.inline
  def apply(applicationPassword: java.lang.String, applicationUsername: java.lang.String): CredentialsUserConfig = {
    val __obj = js.Dynamic.literal(applicationPassword = applicationPassword, applicationUsername = applicationUsername)
  
    __obj.asInstanceOf[CredentialsUserConfig]
  }
}

