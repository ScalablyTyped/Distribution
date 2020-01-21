package typings.awsSdk.applicationinsightsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeComponentConfigurationRecommendationResponse extends js.Object {
  /**
    * The recommended configuration settings of the component. The value is the escaped JSON of the configuration.
    */
  var ComponentConfiguration: js.UndefOr[typings.awsSdk.applicationinsightsMod.ComponentConfiguration] = js.native
}

object DescribeComponentConfigurationRecommendationResponse {
  @scala.inline
  def apply(ComponentConfiguration: ComponentConfiguration = null): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    if (ComponentConfiguration != null) __obj.updateDynamic("ComponentConfiguration")(ComponentConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
}

