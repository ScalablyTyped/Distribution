package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeMLModelsOutput extends js.Object {
  /**
    * The ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  /**
    * A list of MLModel that meet the search criteria.
    */
  var Results: js.UndefOr[MLModels] = js.undefined
}

object DescribeMLModelsOutput {
  @scala.inline
  def apply(NextToken: StringType = null, Results: MLModels = null): DescribeMLModelsOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[DescribeMLModelsOutput]
  }
}

