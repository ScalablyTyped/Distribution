package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetExportSnapshotRecordsRequest extends js.Object {
  /**
    * A token used for advancing to a specific page of results for your get export snapshot records request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetExportSnapshotRecordsRequest {
  @scala.inline
  def apply(pageToken: String = null): GetExportSnapshotRecordsRequest = {
    val __obj = js.Dynamic.literal()
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetExportSnapshotRecordsRequest]
  }
}

