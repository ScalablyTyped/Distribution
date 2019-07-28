package typings.awsDashSdk.clientsIot1clickdevicesserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClaimDevicesByClaimCodeRequest extends js.Object {
  /**
    * The claim code, starting with "C-", as provided by the device manufacturer.
    */
  var ClaimCode: __string
}

object ClaimDevicesByClaimCodeRequest {
  @scala.inline
  def apply(ClaimCode: __string): ClaimDevicesByClaimCodeRequest = {
    val __obj = js.Dynamic.literal(ClaimCode = ClaimCode)
  
    __obj.asInstanceOf[ClaimDevicesByClaimCodeRequest]
  }
}

