package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was stopped.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object StopTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): StopTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopTriggerResponse]
  }
}

