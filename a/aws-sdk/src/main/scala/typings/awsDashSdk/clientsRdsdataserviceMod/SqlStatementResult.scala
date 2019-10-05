package typings.awsDashSdk.clientsRdsdataserviceMod

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
  def apply(numberOfRecordsUpdated: Int | Double = null, resultFrame: ResultFrame = null): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    if (numberOfRecordsUpdated != null) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated.asInstanceOf[js.Any])
    if (resultFrame != null) __obj.updateDynamic("resultFrame")(resultFrame)
    __obj.asInstanceOf[SqlStatementResult]
  }
}

