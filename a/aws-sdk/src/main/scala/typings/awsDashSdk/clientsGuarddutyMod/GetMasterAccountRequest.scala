package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMasterAccountRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object GetMasterAccountRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): GetMasterAccountRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[GetMasterAccountRequest]
  }
}

