package typings.awsSdk.autoscalingplansMod

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
  @scala.inline
  implicit class MetricDimensionOps[Self <: MetricDimension] (val x: Self) extends AnyVal {
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
    def setName(value: MetricDimensionName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: MetricDimensionValue): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

