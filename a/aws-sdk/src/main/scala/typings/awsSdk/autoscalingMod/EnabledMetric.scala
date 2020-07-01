package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnabledMetric extends js.Object {
  /**
    * The granularity of the metric. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.native
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.native
}

object EnabledMetric {
  @scala.inline
  def apply(Granularity: XmlStringMaxLen255 = null, Metric: XmlStringMaxLen255 = null): EnabledMetric = {
    val __obj = js.Dynamic.literal()
    if (Granularity != null) __obj.updateDynamic("Granularity")(Granularity.asInstanceOf[js.Any])
    if (Metric != null) __obj.updateDynamic("Metric")(Metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnabledMetric]
  }
}

