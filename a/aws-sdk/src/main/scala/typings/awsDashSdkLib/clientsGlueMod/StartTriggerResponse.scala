package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was started.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object StartTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): StartTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[StartTriggerResponse]
  }
}

