package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector that you want to delete.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object DeleteDetectorRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): DeleteDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[DeleteDetectorRequest]
  }
}

