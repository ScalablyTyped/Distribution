package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDatasetRequest extends js.Object {
  /**
    * The name of the data set to delete.
    */
  var datasetName: DatasetName = js.native
}

object DeleteDatasetRequest {
  @scala.inline
  def apply(datasetName: DatasetName): DeleteDatasetRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteDatasetRequest]
  }
}

