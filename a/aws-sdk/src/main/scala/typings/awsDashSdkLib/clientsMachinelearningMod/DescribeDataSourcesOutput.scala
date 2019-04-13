package typings
package awsDashSdkLib.clientsMachinelearningMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDataSourcesOutput extends js.Object {
  /**
    * An ID of the next page in the paginated results that indicates at least one more page follows.
    */
  var NextToken: js.UndefOr[StringType] = js.undefined
  /**
    * A list of DataSource that meet the search criteria. 
    */
  var Results: js.UndefOr[DataSources] = js.undefined
}

object DescribeDataSourcesOutput {
  @scala.inline
  def apply(NextToken: StringType = null, Results: DataSources = null): DescribeDataSourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Results != null) __obj.updateDynamic("Results")(Results)
    __obj.asInstanceOf[DescribeDataSourcesOutput]
  }
}

