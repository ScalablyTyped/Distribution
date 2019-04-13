package typings
package awsDashSdkLib.clientsShieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateProtectionResponse extends js.Object {
  /**
    * The unique identifier (ID) for the Protection object that is created.
    */
  var ProtectionId: js.UndefOr[ProtectionId] = js.undefined
}

object CreateProtectionResponse {
  @scala.inline
  def apply(ProtectionId: ProtectionId = null): CreateProtectionResponse = {
    val __obj = js.Dynamic.literal()
    if (ProtectionId != null) __obj.updateDynamic("ProtectionId")(ProtectionId)
    __obj.asInstanceOf[CreateProtectionResponse]
  }
}

