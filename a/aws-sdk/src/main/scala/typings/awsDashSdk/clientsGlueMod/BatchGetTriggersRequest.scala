package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetTriggersRequest extends js.Object {
  /**
    * A list of trigger names, which may be the names returned from the ListTriggers operation.
    */
  var TriggerNames: TriggerNameList = js.native
}

object BatchGetTriggersRequest {
  @scala.inline
  def apply(TriggerNames: TriggerNameList): BatchGetTriggersRequest = {
    val __obj = js.Dynamic.literal(TriggerNames = TriggerNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BatchGetTriggersRequest]
  }
}

