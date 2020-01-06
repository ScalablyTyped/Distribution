package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was deleted.
    */
  var Name: js.UndefOr[NameString] = js.native
}

object DeleteTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): DeleteTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteTriggerResponse]
  }
}

