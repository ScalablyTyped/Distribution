package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComponentConfigurationRecommendationRequest extends js.Object {
  /**
    * The name of the component.
    */
  var ComponentName: typings.awsDashSdk.clientsApplicationinsightsMod.ComponentName
  /**
    * The name of the resource group.
    */
  var ResourceGroupName: typings.awsDashSdk.clientsApplicationinsightsMod.ResourceGroupName
  /**
    * The tier of the application component. Supported tiers include DOT_NET_WORKER, DOT_NET_WEB_TIER, SQL_SERVER, and DEFAULT.
    */
  var Tier: typings.awsDashSdk.clientsApplicationinsightsMod.Tier
}

object DescribeComponentConfigurationRecommendationRequest {
  @scala.inline
  def apply(ComponentName: ComponentName, ResourceGroupName: ResourceGroupName, Tier: Tier): DescribeComponentConfigurationRecommendationRequest = {
    val __obj = js.Dynamic.literal(ComponentName = ComponentName, ResourceGroupName = ResourceGroupName, Tier = Tier)
  
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationRequest]
  }
}

