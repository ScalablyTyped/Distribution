package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobDependency extends js.Object {
  /**
    * The job ID of the AWS Batch job associated with this dependency.
    */
  var jobId: js.UndefOr[String] = js.native
  /**
    * The type of the job dependency.
    */
  var `type`: js.UndefOr[ArrayJobDependency] = js.native
}

object JobDependency {
  @scala.inline
  def apply(jobId: String = null, `type`: ArrayJobDependency = null): JobDependency = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDependency]
  }
}

