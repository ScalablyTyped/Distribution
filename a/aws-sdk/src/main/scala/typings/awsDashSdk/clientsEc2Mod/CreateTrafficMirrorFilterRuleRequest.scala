package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTrafficMirrorFilterRuleRequest extends js.Object {
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. For more information, see How to Ensure Idempotency.
    */
  var ClientToken: js.UndefOr[String] = js.undefined
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The destination CIDR block to assign to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: String
  /**
    * The destination port range.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * The protocol, for example UDP, to assign to the Traffic Mirror rule. For information about the protocol value, see Protocol Numbers on the Internet Assigned Numbers Authority (IANA) website.
    */
  var Protocol: js.UndefOr[Integer] = js.undefined
  /**
    * The action to take (accept | reject) on the filtered traffic.
    */
  var RuleAction: TrafficMirrorRuleAction
  /**
    * The number of the Traffic Mirror rule. This number must be unique for each Traffic Mirror rule in a given direction. The rules are processed in ascending order by rule number.
    */
  var RuleNumber: Integer
  /**
    * The source CIDR block to assign to the Traffic Mirror rule.
    */
  var SourceCidrBlock: String
  /**
    * The source port range.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRangeRequest] = js.undefined
  /**
    * The type of traffic (ingress | egress).
    */
  var TrafficDirection: typings.awsDashSdk.clientsEc2Mod.TrafficDirection
  /**
    * The ID of the filter that this rule is associated with.
    */
  var TrafficMirrorFilterId: String
}

object CreateTrafficMirrorFilterRuleRequest {
  @scala.inline
  def apply(
    DestinationCidrBlock: String,
    RuleAction: TrafficMirrorRuleAction,
    RuleNumber: Integer,
    SourceCidrBlock: String,
    TrafficDirection: TrafficDirection,
    TrafficMirrorFilterId: String,
    ClientToken: String = null,
    Description: String = null,
    DestinationPortRange: TrafficMirrorPortRangeRequest = null,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    Protocol: Int | scala.Double = null,
    SourcePortRange: TrafficMirrorPortRangeRequest = null
  ): CreateTrafficMirrorFilterRuleRequest = {
    val __obj = js.Dynamic.literal(DestinationCidrBlock = DestinationCidrBlock, RuleAction = RuleAction.asInstanceOf[js.Any], RuleNumber = RuleNumber, SourceCidrBlock = SourceCidrBlock, TrafficDirection = TrafficDirection.asInstanceOf[js.Any], TrafficMirrorFilterId = TrafficMirrorFilterId)
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DestinationPortRange != null) __obj.updateDynamic("DestinationPortRange")(DestinationPortRange)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (SourcePortRange != null) __obj.updateDynamic("SourcePortRange")(SourcePortRange)
    __obj.asInstanceOf[CreateTrafficMirrorFilterRuleRequest]
  }
}

