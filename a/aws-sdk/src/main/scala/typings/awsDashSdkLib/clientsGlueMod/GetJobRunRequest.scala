package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRunRequest extends js.Object {
  /**
    * Name of the job definition being run.
    */
  var JobName: NameString
  /**
    * True if a list of predecessor runs should be returned.
    */
  var PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
  /**
    * The ID of the job run.
    */
  var RunId: IdString
}

object GetJobRunRequest {
  @scala.inline
  def apply(
    JobName: NameString,
    RunId: IdString,
    PredecessorsIncluded: js.UndefOr[BooleanValue] = js.undefined
  ): GetJobRunRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName, RunId = RunId)
    if (!js.isUndefined(PredecessorsIncluded)) __obj.updateDynamic("PredecessorsIncluded")(PredecessorsIncluded)
    __obj.asInstanceOf[GetJobRunRequest]
  }
}

