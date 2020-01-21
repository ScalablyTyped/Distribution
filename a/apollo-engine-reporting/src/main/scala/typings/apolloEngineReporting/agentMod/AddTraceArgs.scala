package typings.apolloEngineReporting.agentMod

import typings.apolloEngineReportingProtobuf.mod.Trace
import typings.graphql.astMod.DocumentNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTraceArgs extends js.Object {
  var documentAST: js.UndefOr[DocumentNode] = js.undefined
  var operationName: String
  var queryHash: String
  var queryString: js.UndefOr[String] = js.undefined
  var schemaHash: String
  var trace: Trace
}

object AddTraceArgs {
  @scala.inline
  def apply(
    operationName: String,
    queryHash: String,
    schemaHash: String,
    trace: Trace,
    documentAST: DocumentNode = null,
    queryString: String = null
  ): AddTraceArgs = {
    val __obj = js.Dynamic.literal(operationName = operationName.asInstanceOf[js.Any], queryHash = queryHash.asInstanceOf[js.Any], schemaHash = schemaHash.asInstanceOf[js.Any], trace = trace.asInstanceOf[js.Any])
    if (documentAST != null) __obj.updateDynamic("documentAST")(documentAST.asInstanceOf[js.Any])
    if (queryString != null) __obj.updateDynamic("queryString")(queryString.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddTraceArgs]
  }
}

