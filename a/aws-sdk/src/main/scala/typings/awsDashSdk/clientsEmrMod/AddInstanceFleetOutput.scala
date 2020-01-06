package typings.awsDashSdk.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddInstanceFleetOutput extends js.Object {
  /**
    * The Amazon Resource Name of the cluster.
    */
  var ClusterArn: js.UndefOr[ArnType] = js.native
  /**
    * The unique identifier of the cluster.
    */
  var ClusterId: js.UndefOr[XmlStringMaxLen256] = js.native
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[typings.awsDashSdk.clientsEmrMod.InstanceFleetId] = js.native
}

object AddInstanceFleetOutput {
  @scala.inline
  def apply(
    ClusterArn: ArnType = null,
    ClusterId: XmlStringMaxLen256 = null,
    InstanceFleetId: InstanceFleetId = null
  ): AddInstanceFleetOutput = {
    val __obj = js.Dynamic.literal()
    if (ClusterArn != null) __obj.updateDynamic("ClusterArn")(ClusterArn.asInstanceOf[js.Any])
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId.asInstanceOf[js.Any])
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddInstanceFleetOutput]
  }
}

