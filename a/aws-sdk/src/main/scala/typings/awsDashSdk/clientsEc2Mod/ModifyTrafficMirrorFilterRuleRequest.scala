package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * The description to assign to the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The destination ports that are associated with the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The protocol, for example TCP, to assign to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.undefined
  /**
    * The properties that you want to remove from the Traffic Mirror filter rule. When you remove a property from a Traffic Mirror filter rule, the property is set to the default.
    */
  var RemoveFields: js.UndefOr[TrafficMirrorFilterRuleFieldList] = js.undefined
  /**
    * The action to assign to the rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.undefined
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The port range to assign to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  /**
    * The type of traffic (ingress | egress) to assign to the rule.
    */
  var TrafficDirection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficDirection] = js.undefined
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: String
}

object ModifyTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(
    TrafficMirrorFilterRuleId: String,
    Description: String = null,
    DestinationCidrBlock: String = null,
    DestinationPortRange: TrafficMirrorPortRangeRequest = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Protocol: Int | scala.Double = null,
    RemoveFields: TrafficMirrorFilterRuleFieldList = null,
    RuleAction: TrafficMirrorRuleAction = null,
    RuleNumber: Int | scala.Double = null,
    SourceCidrBlock: String = null,
    SourcePortRange: TrafficMirrorPortRangeRequest = null,
    TrafficDirection: TrafficDirection = null
  ): ModifyTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(TrafficMirrorFilterRuleId = TrafficMirrorFilterRuleId)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock)
    if (DestinationPortRange != null) __obj.updateDynamic("DestinationPortRange")(DestinationPortRange)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RemoveFields != null) __obj.updateDynamic("RemoveFields")(RemoveFields)
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (RuleNumber != null) __obj.updateDynamic("RuleNumber")(RuleNumber.asInstanceOf[js.Any])
    if (SourceCidrBlock != null) __obj.updateDynamic("SourceCidrBlock")(SourceCidrBlock)
    if (SourcePortRange != null) __obj.updateDynamic("SourcePortRange")(SourcePortRange)
    if (TrafficDirection != null) __obj.updateDynamic("TrafficDirection")(TrafficDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyTrafficMirrorFilterRuleRequest]
  }
}

