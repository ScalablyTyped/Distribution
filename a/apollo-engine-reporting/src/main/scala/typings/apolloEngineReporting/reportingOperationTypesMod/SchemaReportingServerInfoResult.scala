package typings.apolloEngineReporting.reportingOperationTypesMod

import typings.graphql.formatErrorMod.GraphQLFormattedError
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaReportingServerInfoResult extends js.Object {
  var data: js.UndefOr[ReportServerInfo] = js.native
  var errors: js.UndefOr[js.Array[GraphQLFormattedError[Record[String, _]]]] = js.native
}

object SchemaReportingServerInfoResult {
  @scala.inline
  def apply(): SchemaReportingServerInfoResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReportingServerInfoResult]
  }
  @scala.inline
  implicit class SchemaReportingServerInfoResultOps[Self <: SchemaReportingServerInfoResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: ReportServerInfo): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setErrorsVarargs(value: (GraphQLFormattedError[Record[String, js.Any]])*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[GraphQLFormattedError[Record[String, _]]]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrors: Self = this.set("errors", js.undefined)
  }
  
}

