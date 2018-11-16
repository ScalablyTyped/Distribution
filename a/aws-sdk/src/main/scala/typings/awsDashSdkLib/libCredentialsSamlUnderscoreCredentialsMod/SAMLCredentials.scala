package typings
package awsDashSdkLib.libCredentialsSamlUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/saml_credentials", "SAMLCredentials")
@js.native
class SAMLCredentials protected ()
  extends awsDashSdkLib.libCredentialsMod.Credentials {
  /**
  		 * Creates a new credentials object.
  		 * @param {object} params - The map of params passed to AWS.STS.assumeRoleWithSAML().
  		 */
  def this(params: SAMLCredentialsParams) = this()
  var params: SAMLCredentialsParams = js.native
}

