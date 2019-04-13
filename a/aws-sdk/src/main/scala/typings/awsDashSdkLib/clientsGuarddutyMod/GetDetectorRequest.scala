package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector that you want to retrieve.
    */
  var DetectorId: __string
}

object GetDetectorRequest {
  @scala.inline
  def apply(DetectorId: __string): GetDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[GetDetectorRequest]
  }
}

