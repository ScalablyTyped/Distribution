package typings
package apolloDashEngineDashReportingLib.distExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/extension", "EngineReportingExtension")
@js.native
class EngineReportingExtension[TContext] protected ()
  extends graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[TContext] {
  def this(options: apolloDashEngineDashReportingLib.distAgentMod.EngineReportingOptions[TContext], addTrace: js.Function3[
      /* signature */ java.lang.String, 
      /* operationName */ java.lang.String, 
      /* trace */ apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Trace, 
      scala.Unit
    ]) = this()
  var addTrace: js.Any = js.native
  var documentAST: js.UndefOr[js.Any] = js.native
  var ensureParentNode: js.Any = js.native
  var generateClientInfo: js.Any = js.native
  var newNode: js.Any = js.native
  var nodes: js.Any = js.native
  var operationName: js.UndefOr[js.Any] = js.native
  var options: js.Any = js.native
  var queryString: js.UndefOr[js.Any] = js.native
  var startHrTime: js.Any = js.native
  var trace: apolloDashEngineDashReportingDashProtobufLib.apolloDashEngineDashReportingDashProtobufMod.Trace = js.native
  @JSName("executionDidStart")
  def executionDidStart_MEngineReportingExtension(o: apolloDashEngineDashReportingLib.Anon_ExecutionArgs): scala.Unit = js.native
  @JSName("requestDidStart")
  def requestDidStart_MEngineReportingExtension(o: apolloDashEngineDashReportingLib.Anon_ParsedQuery[TContext]): graphqlDashExtensionsLib.graphqlDashExtensionsMod.EndHandler = js.native
  @JSName("willResolveField")
  def willResolveField_MEngineReportingExtension(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): (js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ js.Any, scala.Unit]) | scala.Unit = js.native
  @JSName("willSendResponse")
  def willSendResponse_MEngineReportingExtension(o: apolloDashEngineDashReportingLib.Anon_GraphqlResponse): scala.Unit = js.native
}

