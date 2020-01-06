package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceFleetInput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: XmlStringMaxLen256 = js.native
  /**
    * Specifies the configuration of the instance fleet.
    */
  var InstanceFleet: InstanceFleetConfig = js.native
}

object AddInstanceFleetInput {
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256, InstanceFleet: InstanceFleetConfig): AddInstanceFleetInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId.asInstanceOf[js.Any], InstanceFleet = InstanceFleet.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddInstanceFleetInput]
  }
}

