package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobExecutionRequest extends js.Object {
  /**
    * A string (consisting of the digits "0" through "9" which is used to specify a particular job execution on a particular device.
    */
  var executionNumber: js.UndefOr[ExecutionNumber] = js.undefined
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
  /**
    * The name of the thing on which the job execution is running.
    */
  var thingName: ThingName
}

object DescribeJobExecutionRequest {
  @scala.inline
  def apply(jobId: JobId, thingName: ThingName, executionNumber: Int | Double = null): DescribeJobExecutionRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId, thingName = thingName)
    if (executionNumber != null) __obj.updateDynamic("executionNumber")(executionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobExecutionRequest]
  }
}

