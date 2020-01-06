package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegistryCredential extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) or name of credentials created using AWS Secrets Manager.    The credential can use the name of the credentials only if they exist in your current region.  
    */
  var credential: NonEmptyString = js.native
  /**
    *  The service that created the credentials to access a private Docker registry. The valid value, SECRETS_MANAGER, is for AWS Secrets Manager. 
    */
  var credentialProvider: CredentialProviderType = js.native
}

object RegistryCredential {
  @scala.inline
  def apply(credential: NonEmptyString, credentialProvider: CredentialProviderType): RegistryCredential = {
    val __obj = js.Dynamic.literal(credential = credential.asInstanceOf[js.Any], credentialProvider = credentialProvider.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RegistryCredential]
  }
}

