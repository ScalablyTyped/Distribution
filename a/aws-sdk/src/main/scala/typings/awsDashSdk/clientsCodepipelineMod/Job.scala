package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  /**
    * The ID of the AWS account to use when performing the job.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  /**
    * Other data about a job.
    */
  var data: js.UndefOr[JobData] = js.undefined
  /**
    * The unique system-generated ID of the job.
    */
  var id: js.UndefOr[JobId] = js.undefined
  /**
    * A system-generated random number that AWS CodePipeline uses to ensure that the job is being worked on by only one job worker. Use this number in an AcknowledgeJob request.
    */
  var nonce: js.UndefOr[Nonce] = js.undefined
}

object Job {
  @scala.inline
  def apply(accountId: AccountId = null, data: JobData = null, id: JobId = null, nonce: Nonce = null): Job = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (data != null) __obj.updateDynamic("data")(data)
    if (id != null) __obj.updateDynamic("id")(id)
    if (nonce != null) __obj.updateDynamic("nonce")(nonce)
    __obj.asInstanceOf[Job]
  }
}

