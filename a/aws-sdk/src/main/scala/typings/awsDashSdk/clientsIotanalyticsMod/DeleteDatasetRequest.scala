package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetRequest extends js.Object {
  /**
    * The name of the data set to delete.
    */
  var datasetName: DatasetName
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(datasetName: DatasetName): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}

