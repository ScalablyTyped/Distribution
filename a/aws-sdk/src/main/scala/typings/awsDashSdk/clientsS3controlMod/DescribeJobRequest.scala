package typings.awsDashSdk.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobRequest extends js.Object {
  /**
    * 
    */
  var AccountId: typings.awsDashSdk.clientsS3controlMod.AccountId
  /**
    * The ID for the job whose information you want to retrieve.
    */
  var JobId: typings.awsDashSdk.clientsS3controlMod.JobId
}

object DescribeJobRequest {
  @scala.inline
  def apply(AccountId: AccountId, JobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId, JobId = JobId)
  
    __obj.asInstanceOf[DescribeJobRequest]
  }
}

