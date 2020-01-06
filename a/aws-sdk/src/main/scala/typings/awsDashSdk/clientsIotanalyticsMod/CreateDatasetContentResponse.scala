package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDatasetContentResponse extends js.Object {
  /**
    * The version ID of the data set contents which are being created.
    */
  var versionId: js.UndefOr[DatasetContentVersion] = js.native
}

object CreateDatasetContentResponse {
  @scala.inline
  def apply(versionId: DatasetContentVersion = null): CreateDatasetContentResponse = {
    val __obj = js.Dynamic.literal()
    if (versionId != null) __obj.updateDynamic("versionId")(versionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetContentResponse]
  }
}

