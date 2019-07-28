package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyInstanceFleetInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: typings.awsDashSdk.clientsEmrMod.ClusterId
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleet: InstanceFleetModifyConfig
}

object ModifyInstanceFleetInput {
  @scala.inline
  def apply(ClusterId: ClusterId, InstanceFleet: InstanceFleetModifyConfig): ModifyInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId, InstanceFleet = InstanceFleet)
  
    __obj.asInstanceOf[ModifyInstanceFleetInput]
  }
}

