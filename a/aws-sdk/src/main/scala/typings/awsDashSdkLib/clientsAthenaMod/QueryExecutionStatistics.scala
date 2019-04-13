package typings
package awsDashSdkLib.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryExecutionStatistics extends js.Object {
  /**
    * The number of bytes in the data that was queried.
    */
  var DataScannedInBytes: js.UndefOr[Long] = js.undefined
  /**
    * The number of milliseconds that the query took to execute.
    */
  var EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
}

object QueryExecutionStatistics {
  @scala.inline
  def apply(
    DataScannedInBytes: js.UndefOr[Long] = js.undefined,
    EngineExecutionTimeInMillis: js.UndefOr[Long] = js.undefined
  ): QueryExecutionStatistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DataScannedInBytes)) __obj.updateDynamic("DataScannedInBytes")(DataScannedInBytes)
    if (!js.isUndefined(EngineExecutionTimeInMillis)) __obj.updateDynamic("EngineExecutionTimeInMillis")(EngineExecutionTimeInMillis)
    __obj.asInstanceOf[QueryExecutionStatistics]
  }
}

