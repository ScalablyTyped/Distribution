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
  def apply(): DescribeComponentConfigurationRecommendationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeComponentConfigurationRecommendationResponse]
  }
  @scala.inline
  implicit class DescribeComponentConfigurationRecommendationResponseOps[Self <: DescribeComponentConfigurationRecommendationResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponentConfiguration(value: ComponentConfiguration): Self = this.set("ComponentConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComponentConfiguration: Self = this.set("ComponentConfiguration", js.undefined)
  }
  
}

