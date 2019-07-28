package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTriggerResponse extends js.Object {
  /**
    * The name of the trigger.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object CreateTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): CreateTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[CreateTriggerResponse]
  }
}

