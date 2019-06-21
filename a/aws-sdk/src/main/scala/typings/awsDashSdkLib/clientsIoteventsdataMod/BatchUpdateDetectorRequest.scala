package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateDetectorRequest extends js.Object {
  /**
    * The list of detectors (instances) to update, along with the values to update.
    */
  var detectors: UpdateDetectorRequests
}

object BatchUpdateDetectorRequest {
  @scala.inline
  def apply(detectors: UpdateDetectorRequests): BatchUpdateDetectorRequest = {
    val __obj = js.Dynamic.literal(detectors = detectors)
  
    __obj.asInstanceOf[BatchUpdateDetectorRequest]
  }
}

