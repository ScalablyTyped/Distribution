package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAlgorithmsOutput extends js.Object {
  /**
    * &gt;An array of AlgorithmSummary objects, each of which lists an algorithm.
    */
  var AlgorithmSummaryList: awsDashSdkLib.clientsSagemakerMod.AlgorithmSummaryList
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of algorithms, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListAlgorithmsOutput {
  @scala.inline
  def apply(AlgorithmSummaryList: AlgorithmSummaryList, NextToken: NextToken = null): ListAlgorithmsOutput = {
    val __obj = js.Dynamic.literal(AlgorithmSummaryList = AlgorithmSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAlgorithmsOutput]
  }
}

