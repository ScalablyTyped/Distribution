package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OutputGroup extends js.Object {
  /**
    * Custom output group name optionally defined by the user.  Only letters, numbers, and the underscore character allowed; only 32 characters allowed.
    */
  var Name: js.UndefOr[__stringMax32] = js.undefined
  /**
    * Settings associated with the output group.
    */
  var OutputGroupSettings: typings.awsDashSdk.clientsMedialiveMod.OutputGroupSettings
  var Outputs: __listOfOutput
}

object OutputGroup {
  @scala.inline
  def apply(OutputGroupSettings: OutputGroupSettings, Outputs: __listOfOutput, Name: __stringMax32 = null): OutputGroup = {
    val __obj = js.Dynamic.literal(OutputGroupSettings = OutputGroupSettings, Outputs = Outputs)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[OutputGroup]
  }
}

