package typings
package awsDashSdkLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/core", "TemporaryCredentials")
@js.native
class TemporaryCredentials ()
  extends awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentials {
  /**
       * Creates a new temporary credentials object.
       * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
       * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
       */
  def this(options: awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions) = this()
  /**
       * Creates a new temporary credentials object.
       * @param {Object} options - a map of options that are passed to the AWS.STS.assumeRole() or AWS.STS.getSessionToken() operations. If a RoleArn parameter is passed in, credentials will be based on the IAM role.
       * @param {Object} masterCredentials - The master (non-temporary) credentials used to get and refresh credentials from AWS STS.
       */
  def this(options: awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod.TemporaryCredentialsNs.TemporaryCredentialsOptions, masterCredentials: awsDashSdkLib.libCredentialsMod.Credentials) = this()
}

