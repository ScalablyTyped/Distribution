package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTriggersResponse extends js.Object {
  /**
    * A continuation token, if not all the requested triggers have yet been returned.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of triggers for the specified job.
    */
  var Triggers: js.UndefOr[TriggerList] = js.native
}

object GetTriggersResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, Triggers: TriggerList = null): GetTriggersResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Triggers != null) __obj.updateDynamic("Triggers")(Triggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTriggersResponse]
  }
}

