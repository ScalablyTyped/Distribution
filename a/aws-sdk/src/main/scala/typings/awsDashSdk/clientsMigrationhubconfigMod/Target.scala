package typings.awsDashSdk.clientsMigrationhubconfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Target extends js.Object {
  /**
    * The TargetID is a 12-character identifier of the ACCOUNT for which the control was created. (This must be the current account.) 
    */
  var Id: js.UndefOr[TargetId] = js.native
  /**
    * The target type is always an ACCOUNT.
    */
  var Type: TargetType = js.native
}

object Target {
  @scala.inline
  def apply(Type: TargetType, Id: TargetId = null): Target = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

