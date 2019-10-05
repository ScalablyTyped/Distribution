package typings.apolloDashEngineDashReporting

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashEngineDashReporting.distAgentMod.AddTraceArgs
import typings.apolloDashEngineDashReporting.distAgentMod.EngineReportingOptions
import typings.apolloDashEngineDashReporting.distAgentMod.SendValuesBaseOptions
import typings.apolloDashEngineDashReporting.distAgentMod.VariableValueOptions
import typings.apolloDashEngineDashReportingDashProtobuf.apolloDashEngineDashReportingDashProtobufMod.Trace.Details
import typings.apolloDashEngineDashReportingDashProtobuf.distProtobufMod.Trace.IHTTP
import typings.apolloDashServerDashEnv.apolloDashServerDashEnvMod.Headers
import typings.graphql.graphqlMod.GraphQLError
import typings.graphql.typeDefinitionMod.GraphQLResolveInfo
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.EndHandler
import typings.graphqlDashExtensions.graphqlDashExtensionsMod.GraphQLExtension
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/extension", JSImport.Namespace)
@js.native
object distExtensionMod extends js.Object {
  @js.native
  class EngineReportingExtension[TContext] protected () extends GraphQLExtension[TContext] {
    def this(
      options: EngineReportingOptions[TContext],
      addTrace: js.Function1[/* args */ AddTraceArgs, js.Promise[Unit]],
      schemaHash: String
    ) = this()
    var addTrace: js.Any = js.native
    var documentAST: js.UndefOr[js.Any] = js.native
    var explicitOperationName: js.UndefOr[js.Any] = js.native
    var generateClientInfo: js.Any = js.native
    var options: js.Any = js.native
    var queryString: js.UndefOr[js.Any] = js.native
    var schemaHash: js.Any = js.native
    var treeBuilder: js.Any = js.native
    @JSName("didEncounterErrors")
    def didEncounterErrors_MEngineReportingExtension(errors: js.Array[GraphQLError]): Unit = js.native
    @JSName("executionDidStart")
    def executionDidStart_MEngineReportingExtension(o: Anon_ExecutionArgs): Unit = js.native
    @JSName("requestDidStart")
    def requestDidStart_MEngineReportingExtension(o: Anon_Context[TContext]): EndHandler = js.native
    @JSName("willResolveField")
    def willResolveField_MEngineReportingExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): (js.Function2[/* error */ Error | Null, /* result */ js.Any, Unit]) | Unit = js.native
  }
  
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers): Unit = js.native
  def makeHTTPRequestHeaders(http: IHTTP, headers: Headers, sendHeaders: SendValuesBaseOptions): Unit = js.native
  def makeTraceDetails(variables: Record[String, _]): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions): Details = js.native
  def makeTraceDetails(variables: Record[String, _], sendVariableValues: VariableValueOptions, operationString: String): Details = js.native
}

