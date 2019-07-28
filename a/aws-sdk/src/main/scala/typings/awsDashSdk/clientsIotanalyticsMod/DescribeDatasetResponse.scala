package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetResponse extends js.Object {
  /**
    * An object that contains information about the data set.
    */
  var dataset: js.UndefOr[Dataset] = js.undefined
}

object DescribeDatasetResponse {
  @scala.inline
  def apply(dataset: Dataset = null): DescribeDatasetResponse = {
    val __obj = js.Dynamic.literal()
    if (dataset != null) __obj.updateDynamic("dataset")(dataset)
    __obj.asInstanceOf[DescribeDatasetResponse]
  }
}

