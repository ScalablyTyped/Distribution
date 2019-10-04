package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddOnRequest extends js.Object {
  /**
    * The add-on type.
    */
  var addOnType: AddOnType
  /**
    * An object that represents additional parameters when enabling or modifying the automatic snapshot add-on.
    */
  var autoSnapshotAddOnRequest: js.UndefOr[AutoSnapshotAddOnRequest] = js.undefined
}

object AddOnRequest {
  @scala.inline
  def apply(addOnType: AddOnType, autoSnapshotAddOnRequest: AutoSnapshotAddOnRequest = null): AddOnRequest = {
    val __obj = js.Dynamic.literal(addOnType = addOnType.asInstanceOf[js.Any])
    if (autoSnapshotAddOnRequest != null) __obj.updateDynamic("autoSnapshotAddOnRequest")(autoSnapshotAddOnRequest)
    __obj.asInstanceOf[AddOnRequest]
  }
}

