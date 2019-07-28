package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectorDefinitionVersionResponse extends js.Object {
  /**
    * The ARN of the connector definition version.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The time, in milliseconds since the epoch, when the connector definition version was created.
    */
  var CreationTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * Information about the connector definition version.
    */
  var Definition: js.UndefOr[ConnectorDefinitionVersion] = js.undefined
  /**
    * The ID of the connector definition version.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * The version of the connector definition version.
    */
  var Version: js.UndefOr[__string] = js.undefined
}

object GetConnectorDefinitionVersionResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    CreationTimestamp: __string = null,
    Definition: ConnectorDefinitionVersion = null,
    Id: __string = null,
    NextToken: __string = null,
    Version: __string = null
  ): GetConnectorDefinitionVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationTimestamp != null) __obj.updateDynamic("CreationTimestamp")(CreationTimestamp)
    if (Definition != null) __obj.updateDynamic("Definition")(Definition)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[GetConnectorDefinitionVersionResponse]
  }
}

