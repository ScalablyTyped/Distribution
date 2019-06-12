package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HPOObjective extends js.Object {
  /**
    * The name of the metric.
    */
  var metricName: js.UndefOr[MetricName] = js.undefined
  /**
    * A regular expression for finding the metric in the training job logs.
    */
  var metricRegex: js.UndefOr[MetricRegex] = js.undefined
  /**
    * The data type of the metric.
    */
  var `type`: js.UndefOr[HPOObjectiveType] = js.undefined
}

object HPOObjective {
  @scala.inline
  def apply(metricName: MetricName = null, metricRegex: MetricRegex = null, `type`: HPOObjectiveType = null): HPOObjective = {
    val __obj = js.Dynamic.literal()
    if (metricName != null) __obj.updateDynamic("metricName")(metricName)
    if (metricRegex != null) __obj.updateDynamic("metricRegex")(metricRegex)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[HPOObjective]
  }
}

