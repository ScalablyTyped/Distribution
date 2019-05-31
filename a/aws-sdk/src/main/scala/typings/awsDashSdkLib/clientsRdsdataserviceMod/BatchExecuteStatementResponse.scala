package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchExecuteStatementResponse extends js.Object {
  /**
    * The execution results of each batch entry.
    */
  var updateResults: js.UndefOr[UpdateResults] = js.undefined
}

object BatchExecuteStatementResponse {
  @scala.inline
  def apply(updateResults: UpdateResults = null): BatchExecuteStatementResponse = {
    val __obj = js.Dynamic.literal()
    if (updateResults != null) __obj.updateDynamic("updateResults")(updateResults)
    __obj.asInstanceOf[BatchExecuteStatementResponse]
  }
}

