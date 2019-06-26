package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorTarget extends js.Object {
  /**
    * Information about the Traffic Mirror target.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The network interface ID that is attached to the target.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the Network Load Balancer.
    */
  var NetworkLoadBalancerArn: js.UndefOr[String] = js.undefined
  /**
    * The ID of the account that owns the Traffic Mirror target.
    */
  var OwnerId: js.UndefOr[String] = js.undefined
  /**
    * The tags assigned to the Traffic Mirror target.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the Traffic Mirror target.
    */
  var TrafficMirrorTargetId: js.UndefOr[String] = js.undefined
  /**
    * The type of Traffic Mirror target.
    */
  var Type: js.UndefOr[TrafficMirrorTargetType] = js.undefined
}

object TrafficMirrorTarget {
  @scala.inline
  def apply(
    Description: String = null,
    NetworkInterfaceId: String = null,
    NetworkLoadBalancerArn: String = null,
    OwnerId: String = null,
    Tags: TagList = null,
    TrafficMirrorTargetId: String = null,
    Type: TrafficMirrorTargetType = null
  ): TrafficMirrorTarget = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId)
    if (NetworkLoadBalancerArn != null) __obj.updateDynamic("NetworkLoadBalancerArn")(NetworkLoadBalancerArn)
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TrafficMirrorTargetId != null) __obj.updateDynamic("TrafficMirrorTargetId")(TrafficMirrorTargetId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorTarget]
  }
}

