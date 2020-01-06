package typings.awsDashSdk.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateProtectionResponse extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[typings.awsDashSdk.clientsShieldMod.ProtectionId] = js.native
}

object CreateProtectionResponse {
  @scala.inline
  def apply(ProtectionId: ProtectionId = null): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ProtectionId != null) __obj.updateDynamic("ProtectionId")(ProtectionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProtectionResponse]
  }
}

