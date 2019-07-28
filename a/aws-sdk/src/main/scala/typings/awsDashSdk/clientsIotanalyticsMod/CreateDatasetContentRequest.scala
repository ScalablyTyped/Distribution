package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDatasetContentRequest extends js.Object {
  /**
    * The name of the data set.
    */
  var datasetName: DatasetName
}

object CreateDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName): CreateDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
  
    __obj.asInstanceOf[CreateDatasetContentRequest]
  }
}

