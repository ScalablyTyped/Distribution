package typings
package awsDashSdkLib.clientsApplicationautoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricDimension extends js.Object {
  /**
    * The name of the dimension.
    */
  var Name: MetricDimensionName
  /**
    * The value of the dimension.
    */
  var Value: MetricDimensionValue
}

object MetricDimension {
  @scala.inline
  def apply(Name: MetricDimensionName, Value: MetricDimensionValue): MetricDimension = {
    val __obj = js.Dynamic.literal(Name = Name, Value = Value)
  
    __obj.asInstanceOf[MetricDimension]
  }
}

