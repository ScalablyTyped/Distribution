package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProtectionRequest extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object to be deleted.
    */
  var ProtectionId: typings.awsDashSdk.clientsShieldMod.ProtectionId
}

object DeleteProtectionRequest {
  @scala.inline
  def apply(ProtectionId: ProtectionId): DeleteProtectionRequest = {
    val __obj = js.Dynamic.literal(ProtectionId = ProtectionId)
  
    __obj.asInstanceOf[DeleteProtectionRequest]
  }
}

