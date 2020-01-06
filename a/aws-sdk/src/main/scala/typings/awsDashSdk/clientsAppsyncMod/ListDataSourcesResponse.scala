package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDataSourcesResponse extends js.Object {
  /**
    * The DataSource objects.
    */
  var dataSources: js.UndefOr[DataSources] = js.native
  /**
    * An identifier to be passed in the next request to this operation to return the next set of items in the list.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.native
}

object ListDataSourcesResponse {
  @scala.inline
  def apply(dataSources: DataSources = null, nextToken: PaginationToken = null): ListDataSourcesResponse = {
    val __obj = js.Dynamic.literal()
    if (dataSources != null) __obj.updateDynamic("dataSources")(dataSources.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDataSourcesResponse]
  }
}

