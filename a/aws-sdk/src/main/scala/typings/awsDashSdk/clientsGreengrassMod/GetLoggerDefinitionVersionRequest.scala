package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLoggerDefinitionVersionRequest extends js.Object {
  /**
    * The ID of the logger definition.
    */
  var LoggerDefinitionId: __string
  /**
    * The ID of the logger definition version. This value maps to the ''Version'' property of the corresponding ''VersionInformation'' object, which is returned by ''ListLoggerDefinitionVersions'' requests. If the version is the last one that was associated with a logger definition, the value also maps to the ''LatestVersion'' property of the corresponding ''DefinitionInformation'' object.
    */
  var LoggerDefinitionVersionId: __string
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
}

object GetLoggerDefinitionVersionRequest {
  @scala.inline
  def apply(LoggerDefinitionId: __string, LoggerDefinitionVersionId: __string, NextToken: __string = null): GetLoggerDefinitionVersionRequest = {
    val __obj = js.Dynamic.literal(LoggerDefinitionId = LoggerDefinitionId, LoggerDefinitionVersionId = LoggerDefinitionVersionId)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetLoggerDefinitionVersionRequest]
  }
}

