package typings.authmosphere.libSrcTypesOAuthConfigMod

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
    val __obj = js.Dynamic.literal(applicationPassword = applicationPassword, applicationUsername = applicationUsername)
  
    __obj.asInstanceOf[CredentialsUserConfig]
  }
}

