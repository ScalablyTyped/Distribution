package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListMetricsOutput extends js.Object {
  /**
    * The metrics.
    */
  var Metrics: js.UndefOr[Metrics] = js.undefined
  /**
    * The token that marks the start of the next batch of returned results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListMetricsOutput {
  @scala.inline
  def apply(Metrics: Metrics = null, NextToken: NextToken = null): ListMetricsOutput = {
    val __obj = js.Dynamic.literal()
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListMetricsOutput]
  }
}

