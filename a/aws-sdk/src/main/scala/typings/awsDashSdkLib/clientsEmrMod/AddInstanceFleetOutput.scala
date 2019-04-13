package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddInstanceFleetOutput extends js.Object {
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
}

object AddInstanceFleetOutput {
  @scala.inline
  def apply(ClusterId: XmlStringMaxLen256 = null, InstanceFleetId: InstanceFleetId = null): AddInstanceFleetOutput = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId)
    __obj.asInstanceOf[AddInstanceFleetOutput]
  }
}

