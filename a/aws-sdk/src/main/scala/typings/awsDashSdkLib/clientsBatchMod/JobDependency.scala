package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDependency extends js.Object {
  /**
    * The job ID of the AWS Batch job associated with this dependency.
    */
  var jobId: js.UndefOr[String] = js.undefined
  /**
    * The type of the job dependency.
    */
  var `type`: js.UndefOr[ArrayJobDependency] = js.undefined
}

object JobDependency {
  @scala.inline
  def apply(jobId: String = null, `type`: ArrayJobDependency = null): JobDependency = {
    val __obj = js.Dynamic.literal()
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobDependency]
  }
}

