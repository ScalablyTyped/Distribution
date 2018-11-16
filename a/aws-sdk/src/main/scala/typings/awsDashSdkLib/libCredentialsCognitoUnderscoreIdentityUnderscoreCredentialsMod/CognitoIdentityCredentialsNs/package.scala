package typings
package awsDashSdkLib.libCredentialsCognitoUnderscoreIdentityUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object CognitoIdentityCredentialsNs {
  type ClientConfiguration = awsDashSdkLib.libConfigMod.ConfigurationOptions
  type CognitoIdentityCredentialsInputs = awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetIdInput | awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetCredentialsForIdentityInput | awsDashSdkLib.clientsCognitoidentityMod.CognitoIdentityNs.GetOpenIdTokenInput | awsDashSdkLib.clientsStsMod.STSNs.AssumeRoleWithWebIdentityRequest
  type CognitoIdentityOptions = CognitoIdentityCredentialsInputs with awsDashSdkLib.Anon_LoginId
}
