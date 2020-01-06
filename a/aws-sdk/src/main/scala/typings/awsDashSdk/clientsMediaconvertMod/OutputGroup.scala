package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroup extends js.Object {
  /**
    * Use Custom Group Name (CustomName) to specify a name for the output group. This value is displayed on the console and can make your job settings JSON more human-readable. It does not affect your outputs. Use up to twelve characters that are either letters, numbers, spaces, or underscores.
    */
  var CustomName: js.UndefOr[__string] = js.native
  /**
    * Name of the output group
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * Output Group settings, including type
    */
  var OutputGroupSettings: js.UndefOr[typings.awsDashSdk.clientsMediaconvertMod.OutputGroupSettings] = js.native
  /**
    * This object holds groups of encoding settings, one group of settings per output.
    */
  var Outputs: js.UndefOr[__listOfOutput] = js.native
}

object OutputGroup {
  @scala.inline
  def apply(
    CustomName: __string = null,
    Name: __string = null,
    OutputGroupSettings: OutputGroupSettings = null,
    Outputs: __listOfOutput = null
  ): OutputGroup = {
    val __obj = js.Dynamic.literal()
    if (CustomName != null) __obj.updateDynamic("CustomName")(CustomName.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OutputGroupSettings != null) __obj.updateDynamic("OutputGroupSettings")(OutputGroupSettings.asInstanceOf[js.Any])
    if (Outputs != null) __obj.updateDynamic("Outputs")(Outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
}

