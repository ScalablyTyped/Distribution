package typings
package awsDashSdkLib.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitiateJobInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID.
    */
  var accountId: java.lang.String
  /**
    * Provides options for specifying job information.
    */
  var jobParameters: js.UndefOr[JobParameters] = js.undefined
  /**
    * The name of the vault.
    */
  var vaultName: java.lang.String
}

object InitiateJobInput {
  @scala.inline
  def apply(accountId: java.lang.String, vaultName: java.lang.String, jobParameters: JobParameters = null): InitiateJobInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, vaultName = vaultName)
    if (jobParameters != null) __obj.updateDynamic("jobParameters")(jobParameters)
    __obj.asInstanceOf[InitiateJobInput]
  }
}

