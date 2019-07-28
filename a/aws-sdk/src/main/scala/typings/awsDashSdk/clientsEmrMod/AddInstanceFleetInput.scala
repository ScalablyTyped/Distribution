package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddInstanceFleetInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: XmlStringMaxLen256
  /**
    * Specifies the configuration of the instance fleet.
    */
  var InstanceFleet: InstanceFleetConfig
}

object AddInstanceFleetInput {
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256, InstanceFleet: InstanceFleetConfig): AddInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId, InstanceFleet = InstanceFleet)
  
    __obj.asInstanceOf[AddInstanceFleetInput]
  }
}

