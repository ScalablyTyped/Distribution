package typings.awsDashSdk.awsDashSdkMod

import typings.awsDashSdk.libCredentialsSamlUnderscoreCredentialsMod.SAMLCredentialsParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends typings.awsDashSdk.libCoreMod.SAMLCredentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
}

