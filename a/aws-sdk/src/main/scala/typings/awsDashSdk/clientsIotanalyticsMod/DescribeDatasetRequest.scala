package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatasetRequest extends js.Object {
  /**
    * The name of the data set whose information is retrieved.
    */
  var datasetName: DatasetName
}

object DescribeDatasetRequest {
  @scala.inline
  def apply(datasetName: DatasetName): DescribeDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
  
    __obj.asInstanceOf[DescribeDatasetRequest]
  }
}

