package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDatasetContentRequest extends js.Object {
  /**
    * The name of the data set whose content is deleted.
    */
  var datasetName: DatasetName
  /**
    * The version of the data set whose content is deleted. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to delete the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}

object DeleteDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName, versionId: DatasetContentVersion = null): DeleteDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[DeleteDatasetContentRequest]
  }
}

