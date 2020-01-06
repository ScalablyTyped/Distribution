package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTriggersResponse extends js.Object {
  /**
    * A list of trigger definitions.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
  /**
    * A list of names of triggers not found.
    */
  var TriggersNotFound: js.UndefOr[TriggerNameList] = js.native
}

object BatchGetTriggersResponse {
  @scala.inline
  def apply(Triggers: TriggerList = null, TriggersNotFound: TriggerNameList = null): BatchGetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (Triggers != null) __obj.updateDynamic("Triggers")(Triggers.asInstanceOf[js.Any])
    if (TriggersNotFound != null) __obj.updateDynamic("TriggersNotFound")(TriggersNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetTriggersResponse]
  }
}

