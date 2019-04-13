package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExportJobRequest extends js.Object {
  /**
    * The unique ID of your Amazon Pinpoint application.
    */
  var ApplicationId: __string
  var ExportJobRequest: awsDashSdkLib.clientsPinpointMod.ExportJobRequest
}

object CreateExportJobRequest {
  @scala.inline
  def apply(ApplicationId: __string, ExportJobRequest: ExportJobRequest): CreateExportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, ExportJobRequest = ExportJobRequest)
  
    __obj.asInstanceOf[CreateExportJobRequest]
  }
}

