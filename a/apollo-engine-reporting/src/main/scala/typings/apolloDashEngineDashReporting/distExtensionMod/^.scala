package typings.apolloDashEngineDashReporting.distExtensionMod

import typings.apolloDashEngineDashReporting.distAgentMod.SendValuesBaseOptions
import typings.apolloDashEngineDashReporting.distAgentMod.VariableValueOptions
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.TraceNs.Details
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.TraceNs.IHTTP
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Headers
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/extension", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers): Unit = js.native
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers, sendHeaders: SendValuesBaseOptions): Unit = js.native
  def makeTraceDetails(variables: Record[String, _]): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions, operationString: String): Details = js.native
}

