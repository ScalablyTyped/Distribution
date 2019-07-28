package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceStatus extends js.Object {
  /**
    * The Availability Zone of the instance.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * Any scheduled events associated with the instance.
    */
  var Events: js.UndefOr[InstanceStatusEventList] = js.undefined
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * The intended state of the instance. DescribeInstanceStatus requires that an instance be in the running state.
    */
  var InstanceState: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.InstanceState] = js.undefined
  /**
    * Reports impaired functionality that stems from issues internal to the instance, such as impaired reachability.
    */
  var InstanceStatus: js.UndefOr[InstanceStatusSummary] = js.undefined
  /**
    * Reports impaired functionality that stems from issues related to the systems that support an instance, such as hardware failures and network connectivity problems.
    */
  var SystemStatus: js.UndefOr[InstanceStatusSummary] = js.undefined
}

object InstanceStatus {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    Events: InstanceStatusEventList = null,
    InstanceId: String = null,
    InstanceState: InstanceState = null,
    InstanceStatus: InstanceStatusSummary = null,
    SystemStatus: InstanceStatusSummary = null
  ): InstanceStatus = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (InstanceState != null) __obj.updateDynamic("InstanceState")(InstanceState)
    if (InstanceStatus != null) __obj.updateDynamic("InstanceStatus")(InstanceStatus)
    if (SystemStatus != null) __obj.updateDynamic("SystemStatus")(SystemStatus)
    __obj.asInstanceOf[InstanceStatus]
  }
}

