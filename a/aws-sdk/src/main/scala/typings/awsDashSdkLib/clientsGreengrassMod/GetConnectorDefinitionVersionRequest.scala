package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectorDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the connector definition.
    */
  var ConnectorDefinitionId: __string
  /**
    * The ID of the connector definition version.
    */
  var ConnectorDefinitionVersionId: __string
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object GetConnectorDefinitionVersionRequest {
  @scala.inline
  def apply(
    ConnectorDefinitionId: __string,
    ConnectorDefinitionVersionId: __string,
    NextToken: __string = null
  ): GetConnectorDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(ConnectorDefinitionId = ConnectorDefinitionId, ConnectorDefinitionVersionId = ConnectorDefinitionVersionId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetConnectorDefinitionVersionRequest]
  }
}

