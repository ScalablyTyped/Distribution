package typings.awsDashSdk.awsDashSdkMod

import typings.awsDashSdk.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk", "TemporaryCredentials")
@js.native
/**
  * Creates a new temporary credentials object.
  * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
  */
class TemporaryCredentials ()
  extends typings.awsDashSdk.libCoreMod.TemporaryCredentials {
  /**
    * Creates a new temporary credentials object.
    * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
    * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
    */
  def this(options: TemporaryCredentialsOptions) = this()
  def this(
    options: TemporaryCredentialsOptions,
    masterCredentials: typings.awsDashSdk.libCredentialsMod.Credentials
  ) = this()
}

