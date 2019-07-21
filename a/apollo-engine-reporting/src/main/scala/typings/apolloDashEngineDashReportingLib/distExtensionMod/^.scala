package typings
package apolloDashEngineDashReportingLib.distExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/extension", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeHTTPRequestHeaders(
    http: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
    headers: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Headers
  ): scala.Unit = js.native
  def makeHTTPRequestHeaders(
    http: apolloDashEngineDashReportingDashProtobufLib.distProtobufMod.TraceNs.IHTTP,
    headers: apolloDashServerDashEnvLib.apolloDashServerDashEnvMod.Headers,
    sendHeaders: apolloDashEngineDashReportingLib.distAgentMod.SendValuesBaseOptions
  ): scala.Unit = js.native
  def makeTraceDetails(variables: stdLib.Record[java.lang.String, _]): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TraceNs.Details = js.native
  def makeTraceDetails(
    variables: stdLib.Record[java.lang.String, _],
    sendVariableValues: apolloDashEngineDashReportingLib.distAgentMod.VariableValueOptions
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TraceNs.Details = js.native
  def makeTraceDetails(
    variables: stdLib.Record[java.lang.String, _],
    sendVariableValues: apolloDashEngineDashReportingLib.distAgentMod.VariableValueOptions,
    operationString: java.lang.String
  ): apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.TraceNs.Details = js.native
}

