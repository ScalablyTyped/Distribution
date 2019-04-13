package typings
package awsDashSdkLib.clientsDiscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopContinuousExportRequest extends js.Object {
  /**
    * The unique ID assigned to this export.
    */
  var exportId: ConfigurationsExportId
}

object StopContinuousExportRequest {
  @scala.inline
  def apply(exportId: ConfigurationsExportId): StopContinuousExportRequest = {
    val __obj = js.Dynamic.literal(exportId = exportId)
  
    __obj.asInstanceOf[StopContinuousExportRequest]
  }
}

