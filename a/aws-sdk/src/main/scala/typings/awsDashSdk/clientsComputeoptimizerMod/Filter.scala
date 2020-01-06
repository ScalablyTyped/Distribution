package typings.awsDashSdk.clientsComputeoptimizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /**
    * The name of the filter. Specify Finding to filter the results to a specific findings classification. Specify RecommendationSourceType to filter the results to a specific resource type.
    */
  var name: js.UndefOr[FilterName] = js.native
  /**
    * The value of the filter. If you specify the name parameter as Finding, and you're recommendations for an instance, then the valid values are Underprovisioned, Overprovisioned, NotOptimized, or Optimized. If you specify the name parameter as Finding, and you're recommendations for an Auto Scaling group, then the valid values are Optimized, or NotOptimized. If you specify the name parameter as RecommendationSourceType, then the valid values are EC2Instance, or AutoScalingGroup.
    */
  var values: js.UndefOr[FilterValues] = js.native
}

object Filter {
  @scala.inline
  def apply(name: FilterName = null, values: FilterValues = null): Filter = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (values != null) __obj.updateDynamic("values")(values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Filter]
  }
}

