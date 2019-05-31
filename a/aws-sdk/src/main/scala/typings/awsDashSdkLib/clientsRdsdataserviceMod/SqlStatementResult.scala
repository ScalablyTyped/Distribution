package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlStatementResult extends js.Object {
  /**
    * The number of records updated by a SQL statement.
    */
  var numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined
  /**
    * The result set of the SQL statement.
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.undefined
}

object SqlStatementResult {
  @scala.inline
  def apply(numberOfRecordsUpdated: js.UndefOr[RecordsUpdated] = js.undefined, resultFrame: ResultFrame = null): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfRecordsUpdated)) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated)
    if (resultFrame != null) __obj.updateDynamic("resultFrame")(resultFrame)
    __obj.asInstanceOf[SqlStatementResult]
  }
}

