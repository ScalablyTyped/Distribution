package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MsSmoothOutputSettings extends js.Object {
  /**
    * String concatenated to the end of the destination filename.  Required for multiple outputs of the same type.
    */
  var NameModifier: js.UndefOr[__string] = js.undefined
}

object MsSmoothOutputSettings {
  @scala.inline
  def apply(NameModifier: __string = null): MsSmoothOutputSettings = {
    val __obj = js.Dynamic.literal()
    if (NameModifier != null) __obj.updateDynamic("NameModifier")(NameModifier)
    __obj.asInstanceOf[MsSmoothOutputSettings]
  }
}

