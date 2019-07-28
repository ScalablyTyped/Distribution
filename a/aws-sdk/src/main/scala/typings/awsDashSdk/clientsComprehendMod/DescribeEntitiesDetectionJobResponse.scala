package typings.awsDashSdk.clientsComprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEntitiesDetectionJobResponse extends js.Object {
  /**
    * An object that contains the properties associated with an entities detection job.
    */
  var EntitiesDetectionJobProperties: js.UndefOr[typings.awsDashSdk.clientsComprehendMod.EntitiesDetectionJobProperties] = js.undefined
}

object DescribeEntitiesDetectionJobResponse {
  @scala.inline
  def apply(EntitiesDetectionJobProperties: EntitiesDetectionJobProperties = null): DescribeEntitiesDetectionJobResponse = {
    val __obj = js.Dynamic.literal()
    if (EntitiesDetectionJobProperties != null) __obj.updateDynamic("EntitiesDetectionJobProperties")(EntitiesDetectionJobProperties)
    __obj.asInstanceOf[DescribeEntitiesDetectionJobResponse]
  }
}

