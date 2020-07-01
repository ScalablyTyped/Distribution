package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchemaReportingServerInfoResult extends js.Object {
  var data: js.UndefOr[ReportServerInfo] = js.undefined
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.undefined
}

object SchemaReportingServerInfoResult {
  @scala.inline
  def apply(data: ReportServerInfo = null, errors: js.Array[GraphQLFormattedError[Record[String, _]]] = null): SchemaReportingServerInfoResult = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (errors != null) __obj.updateDynamic("errors")(errors.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaReportingServerInfoResult]
  }
}

