package typings.apolloDashEngineDashReporting.distAgentMod

import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.Trace
import typings.graphql.languageAstMod.DocumentNode
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
    val __obj = js.Dynamic.literal(operationName = operationName, queryHash = queryHash, schemaHash = schemaHash, trace = trace)
    if (documentAST != null) __obj.updateDynamic("documentAST")(documentAST)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    __obj.asInstanceOf[AddTraceArgs]
  }
}

