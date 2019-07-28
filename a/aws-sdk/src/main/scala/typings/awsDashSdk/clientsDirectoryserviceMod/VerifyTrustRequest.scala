package typings.awsDashSdk.clientsDirectoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyTrustRequest extends js.Object {
  /**
    * The unique Trust ID of the trust relationship to verify.
    */
  var TrustId: typings.awsDashSdk.clientsDirectoryserviceMod.TrustId
}

object VerifyTrustRequest {
  @scala.inline
  def apply(TrustId: TrustId): VerifyTrustRequest = {
    val __obj = js.Dynamic.literal(TrustId = TrustId)
  
    __obj.asInstanceOf[VerifyTrustRequest]
  }
}

