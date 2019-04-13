package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectorsResponse extends js.Object {
  /**
    * Information about the registered connectors.
    */
  var connectorList: js.UndefOr[ConnectorList] = js.undefined
  /**
    * The token required to retrieve the next set of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetConnectorsResponse {
  @scala.inline
  def apply(connectorList: ConnectorList = null, nextToken: NextToken = null): GetConnectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (connectorList != null) __obj.updateDynamic("connectorList")(connectorList)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetConnectorsResponse]
  }
}

