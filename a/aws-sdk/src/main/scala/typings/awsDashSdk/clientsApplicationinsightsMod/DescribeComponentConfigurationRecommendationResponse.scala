package typings.awsDashSdk.clientsApplicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeComponentConfigurationRecommendationResponse extends js.Object {
  /**
    * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsDashSdk.clientsApplicationinsightsMod.ComponentConfiguration] = js.undefined
}

object DescribeComponentConfigurationRecommendationResponse {
  @scala.inline
  def apply(ComponentConfiguration: ComponentConfiguration = null): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration)
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
}

