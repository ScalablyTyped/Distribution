package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReportingProtobuf.mod.Trace
import typings.apolloServerTypes.mod.Logger
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTraceArgs extends js.Object {
  var document: js.UndefOr[DocumentNode] = js.undefined
  var executableSchemaId: String
  var logger: Logger
  var operationName: String
  var queryHash: String
  var source: js.UndefOr[String] = js.undefined
  var trace: Trace
}

object AddTraceArgs {
  @scala.inline
  def apply(
    executableSchemaId: String,
    logger: Logger,
    operationName: String,
    queryHash: String,
    trace: Trace,
    document: DocumentNode = null,
    source: String = null
  ): AddTraceArgs = {
    val __obj = js.Dynamic.literal(executableSchemaId = executableSchemaId.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], operationName = operationName.asInstanceOf[js.Any], queryHash = queryHash.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    if (document != null) __obj.updateDynamic("document")(document.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTraceArgs]
  }
}

