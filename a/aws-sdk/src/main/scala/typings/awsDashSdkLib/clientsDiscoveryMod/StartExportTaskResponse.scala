package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartExportTaskResponse extends js.Object {
  /**
    * A unique identifier used to query the status of an export request.
    */
  var exportId: js.UndefOr[ConfigurationsExportId] = js.undefined
}

object StartExportTaskResponse {
  @scala.inline
  def apply(exportId: ConfigurationsExportId = null): StartExportTaskResponse = {
    val __obj = js.Dynamic.literal()
    if (exportId != null) __obj.updateDynamic("exportId")(exportId)
    __obj.asInstanceOf[StartExportTaskResponse]
  }
}

