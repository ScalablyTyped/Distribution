package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobRequest extends js.Object {
  /**
    * The automatically generated ID for a job, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsDashSdk.clientsSnowballMod.JobId
}

object DescribeJobRequest {
  @scala.inline
  def apply(JobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[DescribeJobRequest]
  }
}

