package typings
package apolloDashEngineDashReportingLib.distAgentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddTraceArgs extends js.Object {
  var documentAST: js.UndefOr[graphqlLib.languageAstMod.DocumentNode] = js.undefined
  var operationName: java.lang.String
  var queryHash: java.lang.String
  var queryString: js.UndefOr[java.lang.String] = js.undefined
  var trace: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Trace
}

object AddTraceArgs {
  @scala.inline
  def apply(
    operationName: java.lang.String,
    queryHash: java.lang.String,
    trace: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Trace,
    documentAST: graphqlLib.languageAstMod.DocumentNode = null,
    queryString: java.lang.String = null
  ): AddTraceArgs = {
    val __obj = js.Dynamic.literal(operationName = operationName, queryHash = queryHash, trace = trace)
    if (documentAST != null) __obj.updateDynamic("documentAST")(documentAST)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    __obj.asInstanceOf[AddTraceArgs]
  }
}

