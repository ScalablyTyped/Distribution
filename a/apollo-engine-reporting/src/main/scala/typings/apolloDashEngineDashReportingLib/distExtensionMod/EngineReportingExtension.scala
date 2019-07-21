package typings
package apolloDashEngineDashReportingLib.distExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/extension", "EngineReportingExtension")
@js.native
class EngineReportingExtension[TContext] protected ()
  extends graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[TContext] {
  def this(options: apolloDashEngineDashReportingLib.distAgentMod.EngineReportingOptions[TContext], addTrace: js.Function1[
      /* args */ apolloDashEngineDashReportingLib.distAgentMod.AddTraceArgs, 
      js.Promise[scala.Unit]
    ], schemaHash: java.lang.String) = this()
  var addTrace: js.Any = js.native
  var documentAST: js.UndefOr[js.Any] = js.native
  var explicitOperationName: js.UndefOr[js.Any] = js.native
  var generateClientInfo: js.Any = js.native
  var options: js.Any = js.native
  var queryString: js.UndefOr[js.Any] = js.native
  var schemaHash: js.Any = js.native
  var treeBuilder: js.Any = js.native
  @JSName("didEncounterErrors")
  def didEncounterErrors_MEngineReportingExtension(errors: js.Array[graphqlLib.graphqlMod.GraphQLError]): scala.Unit = js.native
  @JSName("executionDidStart")
  def executionDidStart_MEngineReportingExtension(o: apolloDashEngineDashReportingLib.Anon_ExecutionArgs): scala.Unit = js.native
  @JSName("requestDidStart")
  def requestDidStart_MEngineReportingExtension(o: apolloDashEngineDashReportingLib.Anon_Context[TContext]): graphqlDashExtensionsLib.graphqlDashExtensionsMod.EndHandler = js.native
  @JSName("willResolveField")
  def willResolveField_MEngineReportingExtension(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): (js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ js.Any, scala.Unit]) | scala.Unit = js.native
}

