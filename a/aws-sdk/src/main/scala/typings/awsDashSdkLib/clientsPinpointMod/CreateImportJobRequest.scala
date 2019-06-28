package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateImportJobRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: __string
  var ImportJobRequest: awsDashSdkLib.clientsPinpointMod.ImportJobRequest
}

object CreateImportJobRequest {
  @scala.inline
  def apply(ApplicationId: __string, ImportJobRequest: ImportJobRequest): CreateImportJobRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, ImportJobRequest = ImportJobRequest)
  
    __obj.asInstanceOf[CreateImportJobRequest]
  }
}

