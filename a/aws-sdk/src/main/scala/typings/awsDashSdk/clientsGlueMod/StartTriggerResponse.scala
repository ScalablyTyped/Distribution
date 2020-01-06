package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was started.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object StartTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): StartTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartTriggerResponse]
  }
}

