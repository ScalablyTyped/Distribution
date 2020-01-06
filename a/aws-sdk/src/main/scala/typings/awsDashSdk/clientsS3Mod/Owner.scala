package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Owner extends js.Object {
  /**
    * Container for the display name of the owner.
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DisplayName] = js.native
  /**
    * Container for the ID of the owner.
    */
  var ID: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ID] = js.native
}

object Owner {
  @scala.inline
  def apply(DisplayName: DisplayName = null, ID: ID = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ID != null) __obj.updateDynamic("ID")(ID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Owner]
  }
}

