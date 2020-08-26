package typings.apolloEngineReporting

import typings.apolloEngineReporting.agentMod.AddTraceArgs
import typings.apolloEngineReporting.agentMod.EngineReportingOptions
import typings.apolloEngineReporting.agentMod.SendValuesBaseOptions
import typings.apolloEngineReporting.agentMod.VariableValueOptions
import typings.apolloEngineReporting.anon.ExecutableSchemaIdGenerator
import typings.apolloEngineReportingProtobuf.mod.Trace.Details
import typings.apolloEngineReportingProtobuf.protobufMod.Trace.IHTTP
import typings.apolloServerEnv.mod.Headers
import typings.apolloServerPluginBase.mod.ApolloServerPlugin
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/plugin", JSImport.Namespace)
@js.native
object pluginMod extends js.Object {
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers): Unit = js.native
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers, sendHeaders: SendValuesBaseOptions): Unit = js.native
  def makeTraceDetails(variables: Record[String, _]): Details = js.native
  def makeTraceDetails(
    variables: Record[String, _],
    sendVariableValues: js.UndefOr[scala.Nothing],
    operationString: String
  ): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions, operationString: String): Details = js.native
  def plugin[TContext](
    options: js.UndefOr[scala.Nothing],
    addTrace: js.Function1[/* args */ AddTraceArgs, js.Promise[Unit]],
    hasStartSchemaReportingExecutableSchemaIdGeneratorSchemaReport: ExecutableSchemaIdGenerator
  ): ApolloServerPlugin[TContext] = js.native
  def plugin[TContext](
    options: EngineReportingOptions[TContext],
    addTrace: js.Function1[/* args */ AddTraceArgs, js.Promise[Unit]],
    hasStartSchemaReportingExecutableSchemaIdGeneratorSchemaReport: ExecutableSchemaIdGenerator
  ): ApolloServerPlugin[TContext] = js.native
}

