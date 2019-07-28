package typings.awsDashSdk.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnabledMetric extends js.Object {
  /**
    * The granularity of the metric. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
}

object EnabledMetric {
  @scala.inline
  def apply(Granularity: XmlStringMaxLen255 = null, Metric: XmlStringMaxLen255 = null): EnabledMetric = {
    val __obj = js.Dynamic.literal()
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity)
    if (Metric != null) __obj.updateDynamic("Metric")(Metric)
    __obj.asInstanceOf[EnabledMetric]
  }
}

