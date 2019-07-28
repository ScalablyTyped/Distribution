package typings.awsDashSdk.clientsGlacierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobInput extends js.Object {
  /**
    * The AccountId value is the AWS account ID of the account that owns the vault. You can either specify an AWS account ID or optionally a single '-' (hyphen), in which case Amazon S3 Glacier uses the AWS account ID associated with the credentials used to sign the request. If you use an account ID, do not include any hyphens ('-') in the ID. 
    */
  var accountId: String
  /**
    * The ID of the job to describe.
    */
  var jobId: String
  /**
    * The name of the vault.
    */
  var vaultName: String
}

object DescribeJobInput {
  @scala.inline
  def apply(accountId: String, jobId: String, vaultName: String): DescribeJobInput = {
    val __obj = js.Dynamic.literal(accountId = accountId, jobId = jobId, vaultName = vaultName)
  
    __obj.asInstanceOf[DescribeJobInput]
  }
}

