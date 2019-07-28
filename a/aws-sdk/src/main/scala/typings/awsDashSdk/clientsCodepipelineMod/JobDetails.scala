package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDetails extends js.Object {
  /**
    * The AWS account ID associated with the job.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  /**
    * Represents additional information about a job required for a job worker to complete the job. 
    */
  var data: js.UndefOr[JobData] = js.undefined
  /**
    * The unique system-generated ID of the job.
    */
  var id: js.UndefOr[JobId] = js.undefined
}

object JobDetails {
  @scala.inline
  def apply(accountId: AccountId = null, data: JobData = null, id: JobId = null): JobDetails = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[JobDetails]
  }
}

