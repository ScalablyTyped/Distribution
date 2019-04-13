package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetServersResponse extends js.Object {
  /**
    * The time when the server was last modified.
    */
  var lastModifiedOn: js.UndefOr[Timestamp] = js.undefined
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The status of the server catalog.
    */
  var serverCatalogStatus: js.UndefOr[ServerCatalogStatus] = js.undefined
  /**
    * Information about the servers.
    */
  var serverList: js.UndefOr[ServerList] = js.undefined
}

object GetServersResponse {
  @scala.inline
  def apply(
    lastModifiedOn: Timestamp = null,
    nextToken: NextToken = null,
    serverCatalogStatus: ServerCatalogStatus = null,
    serverList: ServerList = null
  ): GetServersResponse = {
    val __obj = js.Dynamic.literal()
    if (lastModifiedOn != null) __obj.updateDynamic("lastModifiedOn")(lastModifiedOn)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (serverCatalogStatus != null) __obj.updateDynamic("serverCatalogStatus")(serverCatalogStatus.asInstanceOf[js.Any])
    if (serverList != null) __obj.updateDynamic("serverList")(serverList)
    __obj.asInstanceOf[GetServersResponse]
  }
}

