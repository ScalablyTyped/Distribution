package typings
package awsDashSdkLib.clientsEmrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceGroupDetail extends js.Object {
  /**
    * The maximum Spot price your are willing to pay for EC2 instances. An optional, nullable field that applies if the MarketType for the instance group is specified as SPOT. Specified in USD. If the value is NULL and SPOT is specified, the maximum Spot price is set equal to the On-Demand price.
    */
  var BidPrice: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The date/time the instance group was created.
    */
  var CreationDateTime: _Date
  /**
    * The date/time the instance group was terminated.
    */
  var EndDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * Unique identifier for the instance group.
    */
  var InstanceGroupId: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * Target number of instances to run in the instance group.
    */
  var InstanceRequestCount: Integer
  /**
    * Instance group role in the cluster
    */
  var InstanceRole: InstanceRoleType
  /**
    * Actual count of running instances.
    */
  var InstanceRunningCount: Integer
  /**
    * EC2 instance type.
    */
  var InstanceType: awsDashSdkLib.clientsEmrMod.InstanceType
  /**
    * Details regarding the state of the instance group.
    */
  var LastStateChangeReason: js.UndefOr[XmlString] = js.undefined
  /**
    * Market type of the EC2 instances used to create a cluster node.
    */
  var Market: MarketType
  /**
    * Friendly name for the instance group.
    */
  var Name: js.UndefOr[XmlStringMaxLen256] = js.undefined
  /**
    * The date/time the instance group was available to the cluster.
    */
  var ReadyDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * The date/time the instance group was started.
    */
  var StartDateTime: js.UndefOr[_Date] = js.undefined
  /**
    * State of instance group. The following values are deprecated: STARTING, TERMINATED, and FAILED.
    */
  var State: InstanceGroupState
}

object InstanceGroupDetail {
  @scala.inline
  def apply(
    CreationDateTime: _Date,
    InstanceRequestCount: Integer,
    InstanceRole: InstanceRoleType,
    InstanceRunningCount: Integer,
    InstanceType: InstanceType,
    Market: MarketType,
    State: InstanceGroupState,
    BidPrice: XmlStringMaxLen256 = null,
    EndDateTime: _Date = null,
    InstanceGroupId: XmlStringMaxLen256 = null,
    LastStateChangeReason: XmlString = null,
    Name: XmlStringMaxLen256 = null,
    ReadyDateTime: _Date = null,
    StartDateTime: _Date = null
  ): InstanceGroupDetail = {
    val __obj = js.Dynamic.literal(CreationDateTime = CreationDateTime, InstanceRequestCount = InstanceRequestCount, InstanceRole = InstanceRole.asInstanceOf[js.Any], InstanceRunningCount = InstanceRunningCount, InstanceType = InstanceType, Market = Market.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
    if (BidPrice != null) __obj.updateDynamic("BidPrice")(BidPrice)
    if (EndDateTime != null) __obj.updateDynamic("EndDateTime")(EndDateTime)
    if (InstanceGroupId != null) __obj.updateDynamic("InstanceGroupId")(InstanceGroupId)
    if (LastStateChangeReason != null) __obj.updateDynamic("LastStateChangeReason")(LastStateChangeReason)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ReadyDateTime != null) __obj.updateDynamic("ReadyDateTime")(ReadyDateTime)
    if (StartDateTime != null) __obj.updateDynamic("StartDateTime")(StartDateTime)
    __obj.asInstanceOf[InstanceGroupDetail]
  }
}

