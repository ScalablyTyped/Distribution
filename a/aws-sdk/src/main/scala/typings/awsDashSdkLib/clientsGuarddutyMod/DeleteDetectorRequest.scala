package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDetectorRequest extends js.Object {
  /**
    * The unique ID that specifies the detector that you want to delete.
    */
  var DetectorId: __string
}

object DeleteDetectorRequest {
  @scala.inline
  def apply(DetectorId: __string): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
}

