package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatastoreRequest extends js.Object {
  /**
    * The name of the data store
    */
  var datastoreName: DatastoreName
  /**
    * If true, additional statistical information about the datastore is included in the response.
    */
  var includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined
}

object DescribeDatastoreRequest {
  @scala.inline
  def apply(datastoreName: DatastoreName, includeStatistics: js.UndefOr[IncludeStatisticsFlag] = js.undefined): DescribeDatastoreRequest = {
    val __obj = js.Dynamic.literal(datastoreName = datastoreName)
    if (!js.isUndefined(includeStatistics)) __obj.updateDynamic("includeStatistics")(includeStatistics)
    __obj.asInstanceOf[DescribeDatastoreRequest]
  }
}

