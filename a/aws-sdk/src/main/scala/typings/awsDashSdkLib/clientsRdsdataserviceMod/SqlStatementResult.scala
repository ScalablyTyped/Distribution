package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SqlStatementResult extends js.Object {
  /**
    * Number of rows updated.
    */
  var numberOfRecordsUpdated: js.UndefOr[Long] = js.undefined
  /**
    * ResultFrame returned by executing the sql statement
    */
  var resultFrame: js.UndefOr[ResultFrame] = js.undefined
}

object SqlStatementResult {
  @scala.inline
  def apply(numberOfRecordsUpdated: js.UndefOr[Long] = js.undefined, resultFrame: ResultFrame = null): SqlStatementResult = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfRecordsUpdated)) __obj.updateDynamic("numberOfRecordsUpdated")(numberOfRecordsUpdated)
    if (resultFrame != null) __obj.updateDynamic("resultFrame")(resultFrame)
    __obj.asInstanceOf[SqlStatementResult]
  }
}

