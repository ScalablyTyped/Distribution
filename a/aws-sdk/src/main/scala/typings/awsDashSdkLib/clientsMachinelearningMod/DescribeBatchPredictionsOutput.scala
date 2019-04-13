package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeBatchPredictionsOutput extends js.Object {
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  /**
    * A list of BatchPrediction objects that meet the search criteria. 
    */
  var Results: js.UndefOr[BatchPredictions] = js.undefined
}

object DescribeBatchPredictionsOutput {
  @scala.inline
  def apply(NextToken: StringType = null, Results: BatchPredictions = null): DescribeBatchPredictionsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[DescribeBatchPredictionsOutput]
  }
}

