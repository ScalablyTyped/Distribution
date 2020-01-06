package typings.awsDashSdk.clientsAutoscalingMod

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
  def apply(Granularity: XmlStringMaxLen255 = null): MetricGranularityType = {
    val __obj = js.Dynamic.literal()
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricGranularityType]
  }
}

