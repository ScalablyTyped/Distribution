package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLoggerDefinitionVersionsRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: __string
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[__string] = js.undefined
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object ListLoggerDefinitionVersionsRequest {
  @scala.inline
  def apply(LoggerDefinitionId: __string, MaxResults: __string = null, NextToken: __string = null): ListLoggerDefinitionVersionsRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListLoggerDefinitionVersionsRequest]
  }
}

