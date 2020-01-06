package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HPOObjective extends js.Object {
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.native
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.native
  /**
    * The data type of the metric.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.native
}

object HPOObjective {
  @scala.inline
  def apply(metricName: MetricName = null, metricRegex: MetricRegex = null, `type`: HPOObjectiveType = null): HPOObjective = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName.asInstanceOf[js.Any])
    if (metricRegex != null) __obj.updateDynamic("metricRegex")(metricRegex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HPOObjective]
  }
}

