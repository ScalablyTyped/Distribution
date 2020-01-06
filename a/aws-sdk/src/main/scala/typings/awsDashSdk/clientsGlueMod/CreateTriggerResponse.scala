package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateTriggerResponse extends js.Object {
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object CreateTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): CreateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTriggerResponse]
  }
}

