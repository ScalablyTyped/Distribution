package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorFilterRule extends js.Object {
  /**
    * The description of the Traffic Mirror rule.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The destination CIDR block assigned to the Traffic Mirror rule.
    */
  var DestinationCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The destination port range assigned to the Traffic Mirror rule.
    */
  var DestinationPortRange: js.UndefOr[TrafficMirrorPortRange] = js.undefined
  /**
    * The protocol assigned to the Traffic Mirror rule.
    */
  var Protocol: js.UndefOr[Integer] = js.undefined
  /**
    * The action assigned to the Traffic Mirror rule.
    */
  var RuleAction: js.UndefOr[TrafficMirrorRuleAction] = js.undefined
  /**
    * The rule number of the Traffic Mirror rule.
    */
  var RuleNumber: js.UndefOr[Integer] = js.undefined
  /**
    * The source CIDR block assigned to the Traffic Mirror rule.
    */
  var SourceCidrBlock: js.UndefOr[String] = js.undefined
  /**
    * The source port range assigned to the Traffic Mirror rule.
    */
  var SourcePortRange: js.UndefOr[TrafficMirrorPortRange] = js.undefined
  /**
    * The traffic direction assigned to the Traffic Mirror rule.
    */
  var TrafficDirection: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.TrafficDirection] = js.undefined
  /**
    * The ID of the Traffic Mirror filter that the rule is associated with.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Traffic Mirror rule.
    */
  var TrafficMirrorFilterRuleId: js.UndefOr[String] = js.undefined
}

object TrafficMirrorFilterRule {
  @scala.inline
  def apply(
    Description: String = null,
    DestinationCidrBlock: String = null,
    DestinationPortRange: TrafficMirrorPortRange = null,
    Protocol: Int | scala.Double = null,
    RuleAction: TrafficMirrorRuleAction = null,
    RuleNumber: Int | scala.Double = null,
    SourceCidrBlock: String = null,
    SourcePortRange: TrafficMirrorPortRange = null,
    TrafficDirection: TrafficDirection = null,
    TrafficMirrorFilterId: String = null,
    TrafficMirrorFilterRuleId: String = null
  ): TrafficMirrorFilterRule = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DestinationCidrBlock != null) __obj.updateDynamic("DestinationCidrBlock")(DestinationCidrBlock)
    if (DestinationPortRange != null) __obj.updateDynamic("DestinationPortRange")(DestinationPortRange)
    if (Protocol != null) __obj.updateDynamic("Protocol")(Protocol.asInstanceOf[js.Any])
    if (RuleAction != null) __obj.updateDynamic("RuleAction")(RuleAction.asInstanceOf[js.Any])
    if (RuleNumber != null) __obj.updateDynamic("RuleNumber")(RuleNumber.asInstanceOf[js.Any])
    if (SourceCidrBlock != null) __obj.updateDynamic("SourceCidrBlock")(SourceCidrBlock)
    if (SourcePortRange != null) __obj.updateDynamic("SourcePortRange")(SourcePortRange)
    if (TrafficDirection != null) __obj.updateDynamic("TrafficDirection")(TrafficDirection.asInstanceOf[js.Any])
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId)
    if (TrafficMirrorFilterRuleId != null) __obj.updateDynamic("TrafficMirrorFilterRuleId")(TrafficMirrorFilterRuleId)
    __obj.asInstanceOf[TrafficMirrorFilterRule]
  }
}

