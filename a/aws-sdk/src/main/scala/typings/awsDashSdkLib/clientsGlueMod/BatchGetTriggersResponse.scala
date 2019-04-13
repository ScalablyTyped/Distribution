package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetTriggersResponse extends js.Object {
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.undefined
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.undefined
}

object BatchGetTriggersResponse {
  @scala.inline
  def apply(Triggers: TriggerList = null, TriggersNotFound: TriggerNameList = null): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (Triggers != null) __obj.updateDynamic("Triggers")(Triggers)
    if (TriggersNotFound != null) __obj.updateDynamic("TriggersNotFound")(TriggersNotFound)
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
}

