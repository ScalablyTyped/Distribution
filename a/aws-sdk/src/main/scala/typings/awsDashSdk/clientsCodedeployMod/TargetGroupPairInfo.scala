package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupPairInfo extends js.Object {
  /**
    *  The path used by a load balancer to route production traffic when an Amazon ECS deployment is complete. 
    */
  var prodTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
  /**
    *  One pair of target groups. One is associated with the original task set. The second is associated with the task set that serves traffic after the deployment is complete. 
    */
  var targetGroups: js.UndefOr[TargetGroupInfoList] = js.undefined
  /**
    *  An optional path used by a load balancer to route test traffic after an Amazon ECS deployment. Validation can occur while test traffic is served during a deployment. 
    */
  var testTrafficRoute: js.UndefOr[TrafficRoute] = js.undefined
}

object TargetGroupPairInfo {
  @scala.inline
  def apply(
    prodTrafficRoute: TrafficRoute = null,
    targetGroups: TargetGroupInfoList = null,
    testTrafficRoute: TrafficRoute = null
  ): TargetGroupPairInfo = {
    val __obj = js.Dynamic.literal()
    if (prodTrafficRoute != null) __obj.updateDynamic("prodTrafficRoute")(prodTrafficRoute)
    if (targetGroups != null) __obj.updateDynamic("targetGroups")(targetGroups)
    if (testTrafficRoute != null) __obj.updateDynamic("testTrafficRoute")(testTrafficRoute)
    __obj.asInstanceOf[TargetGroupPairInfo]
  }
}

