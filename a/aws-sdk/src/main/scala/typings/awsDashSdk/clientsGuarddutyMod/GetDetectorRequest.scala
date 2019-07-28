package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDetectorRequest extends js.Object {
  /**
    * The unique ID of the detector that you want to get.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object GetDetectorRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): GetDetectorRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[GetDetectorRequest]
  }
}

