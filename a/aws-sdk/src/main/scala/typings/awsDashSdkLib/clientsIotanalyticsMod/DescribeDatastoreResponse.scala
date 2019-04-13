package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDatastoreResponse extends js.Object {
  /**
    * Information about the data store.
    */
  var datastore: js.UndefOr[Datastore] = js.undefined
  /**
    * Additional statistical information about the data store. Included if the 'includeStatistics' parameter is set to true in the request.
    */
  var statistics: js.UndefOr[DatastoreStatistics] = js.undefined
}

object DescribeDatastoreResponse {
  @scala.inline
  def apply(datastore: Datastore = null, statistics: DatastoreStatistics = null): DescribeDatastoreResponse = {
    val __obj = js.Dynamic.literal()
    if (datastore != null) __obj.updateDynamic("datastore")(datastore)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[DescribeDatastoreResponse]
  }
}

