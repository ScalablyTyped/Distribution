package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTopicsDetectionJobResponse extends js.Object {
  /**
    * The list of properties for the requested job.
    */
  var TopicsDetectionJobProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.TopicsDetectionJobProperties] = js.undefined
}

object DescribeTopicsDetectionJobResponse {
  @scala.inline
  def apply(TopicsDetectionJobProperties: TopicsDetectionJobProperties = null): DescribeTopicsDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (TopicsDetectionJobProperties != null) __obj.updateDynamic("TopicsDetectionJobProperties")(TopicsDetectionJobProperties)
    __obj.asInstanceOf[DescribeTopicsDetectionJobResponse]
  }
}

