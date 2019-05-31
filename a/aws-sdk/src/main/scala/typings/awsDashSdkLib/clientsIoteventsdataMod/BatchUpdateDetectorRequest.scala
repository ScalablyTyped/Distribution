package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchUpdateDetectorRequest extends js.Object {
  /**
    * The list of detectors (instances) to be updated, along with the values to be updated.
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

