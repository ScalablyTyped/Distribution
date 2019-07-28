package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateExportJobRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var ExportJobRequest: typings.awsDashSdk.clientsPinpointMod.ExportJobRequest
}

object CreateExportJobRequest {
  @scala.inline
  def apply(ApplicationId: __string, ExportJobRequest: ExportJobRequest): CreateExportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, ExportJobRequest = ExportJobRequest)
  
    __obj.asInstanceOf[CreateExportJobRequest]
  }
}

