package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAnomalyDetectorsOutput extends js.Object {
  /**
    * The list of anomaly detection models returned by the operation.
    */
  var AnomalyDetectors: js.UndefOr[AnomalyDetectors] = js.undefined
  /**
    * A token that you can use in a subsequent operation to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeAnomalyDetectorsOutput {
  @scala.inline
  def apply(AnomalyDetectors: AnomalyDetectors = null, NextToken: NextToken = null): DescribeAnomalyDetectorsOutput = {
    val __obj = js.Dynamic.literal()
    if (AnomalyDetectors != null) __obj.updateDynamic("AnomalyDetectors")(AnomalyDetectors)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAnomalyDetectorsOutput]
  }
}

