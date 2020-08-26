package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricGranularityType extends js.Object {
  /**
    * The granularity. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.native
}

object MetricGranularityType {
  @scala.inline
  def apply(): MetricGranularityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricGranularityType]
  }
  @scala.inline
  implicit class MetricGranularityTypeOps[Self <: MetricGranularityType] (val x: Self) extends AnyVal {
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
    def setGranularity(value: XmlStringMaxLen255): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGranularity: Self = this.set("Granularity", js.undefined)
  }
  
}

