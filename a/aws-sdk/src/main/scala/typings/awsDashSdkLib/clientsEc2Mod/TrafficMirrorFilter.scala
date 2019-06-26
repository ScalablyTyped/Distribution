package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficMirrorFilter extends js.Object {
  /**
    * The description of the Traffic Mirror filter.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * Information about the egress rules that are associated with the Traffic Mirror filter.
    */
  var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.undefined
  /**
    * Information about the ingress rules that are associated with the Traffic Mirror filter.
    */
  var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.undefined
  /**
    * The network service traffic that is associated with the Traffic Mirror filter.
    */
  var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.undefined
  /**
    * The tags assigned to the Traffic Mirror filter.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.undefined
}

object TrafficMirrorFilter {
  @scala.inline
  def apply(
    Description: String = null,
    EgressFilterRules: TrafficMirrorFilterRuleList = null,
    IngressFilterRules: TrafficMirrorFilterRuleList = null,
    NetworkServices: TrafficMirrorNetworkServiceList = null,
    Tags: TagList = null,
    TrafficMirrorFilterId: String = null
  ): TrafficMirrorFilter = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (EgressFilterRules != null) __obj.updateDynamic("EgressFilterRules")(EgressFilterRules)
    if (IngressFilterRules != null) __obj.updateDynamic("IngressFilterRules")(IngressFilterRules)
    if (NetworkServices != null) __obj.updateDynamic("NetworkServices")(NetworkServices)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId)
    __obj.asInstanceOf[TrafficMirrorFilter]
  }
}

