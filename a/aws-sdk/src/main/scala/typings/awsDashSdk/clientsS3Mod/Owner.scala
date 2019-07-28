package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Owner extends js.Object {
  /**
    * 
    */
  var DisplayName: js.UndefOr[typings.awsDashSdk.clientsS3Mod.DisplayName] = js.undefined
  /**
    * 
    */
  var ID: js.UndefOr[typings.awsDashSdk.clientsS3Mod.ID] = js.undefined
}

object Owner {
  @scala.inline
  def apply(DisplayName: DisplayName = null, ID: ID = null): Owner = {
    val __obj = js.Dynamic.literal()
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ID != null) __obj.updateDynamic("ID")(ID)
    __obj.asInstanceOf[Owner]
  }
}

