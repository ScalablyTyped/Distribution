package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrafficMirrorFilter extends js.Object {
  /**
    * The description of the Traffic Mirror filter.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * Information about the egress rules that are associated with the Traffic Mirror filter.
    */
  var EgressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  /**
    * Information about the ingress rules that are associated with the Traffic Mirror filter.
    */
  var IngressFilterRules: js.UndefOr[TrafficMirrorFilterRuleList] = js.native
  /**
    * The network service traffic that is associated with the Traffic Mirror filter.
    */
  var NetworkServices: js.UndefOr[TrafficMirrorNetworkServiceList] = js.native
  /**
    * The tags assigned to the Traffic Mirror filter.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the Traffic Mirror filter.
    */
  var TrafficMirrorFilterId: js.UndefOr[String] = js.native
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
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (EgressFilterRules != null) __obj.updateDynamic("EgressFilterRules")(EgressFilterRules.asInstanceOf[js.Any])
    if (IngressFilterRules != null) __obj.updateDynamic("IngressFilterRules")(IngressFilterRules.asInstanceOf[js.Any])
    if (NetworkServices != null) __obj.updateDynamic("NetworkServices")(NetworkServices.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (TrafficMirrorFilterId != null) __obj.updateDynamic("TrafficMirrorFilterId")(TrafficMirrorFilterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrafficMirrorFilter]
  }
}

