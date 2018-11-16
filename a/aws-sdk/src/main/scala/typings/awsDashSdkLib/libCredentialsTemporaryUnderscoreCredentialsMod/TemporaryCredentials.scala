package typings
package awsDashSdkLib.libCredentialsTemporaryUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/credentials/temporary_credentials", "TemporaryCredentials")
@js.native
class TemporaryCredentials ()
  extends awsDashSdkLib.libCredentialsMod.Credentials {
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
  /**
       * The master (non-temporary) credentials used to get and refresh temporary credentials from AWS STS.
       */
  var masterCredentials: awsDashSdkLib.libCredentialsMod.Credentials = js.native
}

