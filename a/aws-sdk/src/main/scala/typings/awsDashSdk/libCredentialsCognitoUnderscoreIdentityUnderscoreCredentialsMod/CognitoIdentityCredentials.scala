package typings.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod

import typings.awsDashSdk.clientsCognitoidentityMod.GetCredentialsForIdentityResponse
import typings.awsDashSdk.clientsCognitoidentityMod.GetIdInput
import typings.awsDashSdk.clientsCognitoidentityMod.GetOpenIdTokenInput
import typings.awsDashSdk.clientsStsMod.AssumeRoleWithWebIdentityRequest
import typings.awsDashSdk.clientsStsMod.AssumeRoleWithWebIdentityResponse
import typings.awsDashSdk.libConfigMod.ConfigurationOptions
import typings.awsDashSdk.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod.CognitoIdentityCredentialsNs.CognitoIdentityOptions
import typings.awsDashSdk.libCredentialsMod.Credentials
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/cognito_identity_credentials", "CognitoIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  */
class CognitoIdentityCredentials () extends Credentials {
  /**
    * Creates a new credentials object with optional configuration.
    */
  def this(options: CognitoIdentityOptions) = this()
  def this(options: CognitoIdentityOptions, clientConfig: ConfigurationOptions) = this()
  /**
    * The raw data response from the call to AWS.CognitoIdentity.getCredentialsForIdentity(), or AWS.STS.assumeRoleWithWebIdentity().
    */
  var data: GetCredentialsForIdentityResponse | AssumeRoleWithWebIdentityResponse = js.native
  /**
    * The Cognito ID returned by the last call to AWS.CognitoIdentity.getOpenIdToken().
    */
  var identityId: String = js.native
  /**
    * The map of params passed to AWS.CognitoIdentity.getId(), AWS.CognitoIdentity.getOpenIdToken(), and AWS.STS.assumeRoleWithWebIdentity().
    */
  var params: GetIdInput | GetOpenIdTokenInput | AssumeRoleWithWebIdentityRequest = js.native
  /**
    * Clears the cached Cognito ID associated with the currently configured identity pool ID.
    */
  def clearCachedId(): Unit = js.native
}

