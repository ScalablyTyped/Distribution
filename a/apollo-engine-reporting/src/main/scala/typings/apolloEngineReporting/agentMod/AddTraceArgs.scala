package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReportingProtobuf.mod.Trace
import typings.apolloServerTypes.mod.Logger
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddTraceArgs extends js.Object {
  var document: js.UndefOr[DocumentNode] = js.native
  var executableSchemaId: String = js.native
  var logger: Logger = js.native
  var operationName: String = js.native
  var queryHash: String = js.native
  var source: js.UndefOr[String] = js.native
  var trace: Trace = js.native
}

object AddTraceArgs {
  @scala.inline
  def apply(executableSchemaId: String, logger: Logger, operationName: String, queryHash: String, trace: Trace): AddTraceArgs = {
    val __obj = js.Dynamic.literal(executableSchemaId = executableSchemaId.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], queryHash = queryHash.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTraceArgs]
  }
  @scala.inline
  implicit class AddTraceArgsOps[Self <: AddTraceArgs] (val x: Self) extends AnyVal {
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
    def setExecutableSchemaId(value: String): Self = this.set("executableSchemaId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def setOperationName(value: String): Self = this.set("operationName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQueryHash(value: String): Self = this.set("queryHash", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrace(value: Trace): Self = this.set("trace", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocument: Self = this.set("document", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

