package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchExecuteStatementResponse extends js.Object {
  /**
    * The execution results of each batch entry.
    */
  var updateResults: js.UndefOr[UpdateResults] = js.native
}

object BatchExecuteStatementResponse {
  @scala.inline
  def apply(updateResults: UpdateResults = null): BatchExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    if (updateResults != null) __obj.updateDynamic("updateResults")(updateResults.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchExecuteStatementResponse]
  }
}

