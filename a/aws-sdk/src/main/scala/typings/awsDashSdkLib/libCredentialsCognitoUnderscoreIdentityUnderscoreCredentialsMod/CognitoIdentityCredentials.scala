package typings
package awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials ()
  extends awsDashSdkLib.libCredentialsMod.Credentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions) = this()
  def this(options: awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions, clientConfig: awsDashSdkLib.libConfigMod.ConfigurationOptions) = this()
  /**
    * The raw data response from the call to AWS.CognitoIdentity.getCredentialsForIdentity(), or AWS.STS.assumeRoleWithWebIdentity().
    */
  var data: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityResponse | awsDashSdkLib.clientsStsMod.STSNs.AssumeRoleWithWebIdentityResponse = js.native
  /**
    * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
    */
  var identityId: java.lang.String = js.native
  /**
    * The map of params passed to AWS.CognitoIdentity.getId(), AWS.CognitoIdentity.getOpenIdToken(), and AWS.STS.assumeRoleWithWebIdentity().
    */
  var params: awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdInput | awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenInput | awsDashSdkLib.clientsStsMod.STSNs.AssumeRoleWithWebIdentityRequest = js.native
  /**
    * Clears the cached Cognito ID associated with the currently configured identity pool ID.
    */
  def clearCachedId(): scala.Unit = js.native
}

