package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAlgorithmsOutput extends js.Object {
  /**
    * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
    */
  var AlgorithmSummaryList: typings.awsDashSdk.clientsSagemakerMod.AlgorithmSummaryList
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
}

object ListAlgorithmsOutput {
  @scala.inline
  def apply(AlgorithmSummaryList: AlgorithmSummaryList, NextToken: NextToken = null): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
}

