package typings.awsSdk.applicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricDimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var Name: MetricDimensionName = js.native
  /**
    * The value of the dimension.
    */
  var Value: MetricDimensionValue = js.native
}

object MetricDimension {
  @scala.inline
  def apply(Name: MetricDimensionName, Value: MetricDimensionValue): MetricDimension = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricDimension]
  }
}

