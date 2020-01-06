package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OutputGroup extends js.Object {
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[__stringMax32] = js.native
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typings.awsDashSdk.clientsMedialiveMod.OutputGroupSettings = js.native
  var Outputs: __listOfOutput = js.native
}

object OutputGroup {
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: __listOfOutput, Name: __stringMax32 = null): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings.asInstanceOf[js.Any], Outputs = Outputs.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputGroup]
  }
}

