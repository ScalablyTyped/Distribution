package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTriggersResponse extends js.Object {
  /**
    * A continuation token, if the returned list does not contain the last metric available.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * The names of all triggers in the account, or the triggers with the specified tags.
    */
  var TriggerNames: js.UndefOr[TriggerNameList] = js.undefined
}

object ListTriggersResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, TriggerNames: TriggerNameList = null): ListTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (TriggerNames != null) __obj.updateDynamic("TriggerNames")(TriggerNames)
    __obj.asInstanceOf[ListTriggersResponse]
  }
}

