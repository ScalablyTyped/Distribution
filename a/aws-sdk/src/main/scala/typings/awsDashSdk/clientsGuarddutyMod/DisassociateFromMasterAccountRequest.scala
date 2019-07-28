package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateFromMasterAccountRequest extends js.Object {
  /**
    * The unique ID of the detector of the GuardDuty member account.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
}

object DisassociateFromMasterAccountRequest {
  @scala.inline
  def apply(DetectorId: DetectorId): DisassociateFromMasterAccountRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId)
  
    __obj.asInstanceOf[DisassociateFromMasterAccountRequest]
  }
}

