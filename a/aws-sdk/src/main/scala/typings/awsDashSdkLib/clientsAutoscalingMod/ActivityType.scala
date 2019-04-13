package typings
package awsDashSdkLib.clientsAutoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityType extends js.Object {
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[Activity] = js.undefined
}

object ActivityType {
  @scala.inline
  def apply(Activity: Activity = null): ActivityType = {
    val __obj = js.Dynamic.literal()
    if (Activity != null) __obj.updateDynamic("Activity")(Activity)
    __obj.asInstanceOf[ActivityType]
  }
}

