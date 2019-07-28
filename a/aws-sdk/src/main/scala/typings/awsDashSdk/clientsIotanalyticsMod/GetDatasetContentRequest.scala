package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDatasetContentRequest extends js.Object {
  /**
    * The name of the data set whose contents are retrieved.
    */
  var datasetName: DatasetName
  /**
    * The version of the data set whose contents are retrieved. You can also use the strings "$LATEST" or "$LATEST_SUCCEEDED" to retrieve the contents of the latest or latest successfully completed data set. If not specified, "$LATEST_SUCCEEDED" is the default.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.undefined
}

object GetDatasetContentRequest {
  @scala.inline
  def apply(datasetName: DatasetName, versionId: DatasetContentVersion = null): GetDatasetContentRequest = {
    val __obj = js.Dynamic.literal(datasetName = datasetName)
    if (versionId != null) __obj.updateDynamic("versionId")(versionId)
    __obj.asInstanceOf[GetDatasetContentRequest]
  }
}

