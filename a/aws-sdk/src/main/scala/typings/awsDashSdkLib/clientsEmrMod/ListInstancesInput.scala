package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListInstancesInput extends js.Object {
  /**
    * The identifier of the cluster for which to list the instances.
    */
  var ClusterId: awsDashSdkLib.clientsEmrMod.ClusterId
  /**
    * The unique identifier of the instance fleet.
    */
  var InstanceFleetId: js.UndefOr[InstanceFleetId] = js.undefined
  /**
    * The node type of the instance fleet. For example MASTER, CORE, or TASK.
    */
  var InstanceFleetType: js.UndefOr[InstanceFleetType] = js.undefined
  /**
    * The identifier of the instance group for which to list the instances.
    */
  var InstanceGroupId: js.UndefOr[InstanceGroupId] = js.undefined
  /**
    * The type of instance group for which to list the instances.
    */
  var InstanceGroupTypes: js.UndefOr[InstanceGroupTypeList] = js.undefined
  /**
    * A list of instance states that will filter the instances returned with this request.
    */
  var InstanceStates: js.UndefOr[InstanceStateList] = js.undefined
  /**
    * The pagination token that indicates the next set of results to retrieve.
    */
  var Marker: js.UndefOr[Marker] = js.undefined
}

object ListInstancesInput {
  @scala.inline
  def apply(
    ClusterId: ClusterId,
    InstanceFleetId: InstanceFleetId = null,
    InstanceFleetType: InstanceFleetType = null,
    InstanceGroupId: InstanceGroupId = null,
    InstanceGroupTypes: InstanceGroupTypeList = null,
    InstanceStates: InstanceStateList = null,
    Marker: Marker = null
  ): ListInstancesInput = {
    val __obj = js.Dynamic.literal(ClusterId = ClusterId)
    if (InstanceFleetId != null) __obj.updateDynamic("InstanceFleetId")(InstanceFleetId)
    if (InstanceFleetType != null) __obj.updateDynamic("InstanceFleetType")(InstanceFleetType.asInstanceOf[js.Any])
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId)
    if (InstanceGroupTypes != null) __obj.updateDynamic("InstanceGroupTypes")(InstanceGroupTypes)
    if (InstanceStates != null) __obj.updateDynamic("InstanceStates")(InstanceStates)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ListInstancesInput]
  }
}

