package typings.awsDashSdk.libCoreMod

import typings.awsDashSdk.libConfigMod.ConfigurationOptions
import typings.awsDashSdk.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentialsNs.WebIdentityCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "WebIdentityCredentials")
@js.native
/**
  * Creates a new credentials object.
  * @param {string} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
  */
class WebIdentityCredentials ()
  extends typings.awsDashSdk.libCredentialsWebUnderscoreIdentityUnderscoreCredentialsMod.WebIdentityCredentials {
  /**
    * Creates a new credentials object with optional configuraion.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    * @param {Object} clientConfig - a map of configuration options to pass to the underlying STS client.
    */
  def this(options: WebIdentityCredentialsOptions) = this()
  def this(options: WebIdentityCredentialsOptions, clientConfig: ConfigurationOptions) = this()
}

