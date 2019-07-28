package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricGranularityType extends js.Object {
  /**
    * The granularity. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object MetricGranularityType {
  @scala.inline
  def apply(Granularity: XmlStringMaxLen255 = null): MetricGranularityType = {
    val __obj = js.Dynamic.literal()
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity)
    __obj.asInstanceOf[MetricGranularityType]
  }
}

