package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopTriggerResponse extends js.Object {
  /**
    * The name of the trigger that was stopped.
    */
  var Name: js.UndefOr[NameString] = js.undefined
}

object StopTriggerResponse {
  @scala.inline
  def apply(Name: NameString = null): StopTriggerResponse = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name)
    __obj.asInstanceOf[StopTriggerResponse]
  }
}

