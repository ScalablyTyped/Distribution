package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDataSourcesResponse extends js.Object {
  /**
    * The DataSource objects.
    */
  var dataSources: js.UndefOr[DataSources] = js.undefined
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(dataSources: DataSources = null, nextToken: PaginationToken = null): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
}

