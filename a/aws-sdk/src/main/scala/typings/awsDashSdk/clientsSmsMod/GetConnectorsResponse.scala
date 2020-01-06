package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetConnectorsResponse extends js.Object {
  /**
    * Information about the registered connectors.
    */
  var connectorList: js.UndefOr[ConnectorList] = js.native
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetConnectorsResponse {
  @scala.inline
  def apply(connectorList: ConnectorList = null, nextToken: NextToken = null): GetConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (connectorList != null) __obj.updateDynamic("connectorList")(connectorList.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectorsResponse]
  }
}

