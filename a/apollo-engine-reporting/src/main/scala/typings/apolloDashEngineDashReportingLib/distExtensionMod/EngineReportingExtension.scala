package typings
package apolloDashEngineDashReportingLib.distExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @JSImport("apollo-engine-reporting/dist/extension", "EngineReportingExtension")
@js.native
class EngineReportingExtension[TContext] protected () extends js.Object {
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
  def executionDidStart(o: apolloDashEngineDashReportingLib.Anon_ExecutionArgs): scala.Unit = js.native
  def requestDidStart(o: apolloDashEngineDashReportingLib.Anon_Context[TContext]): js.Any = js.native
  def willResolveField(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): (js.Function2[/* error */ nodeLib.Error | scala.Null, /* result */ js.Any, scala.Unit]) | scala.Unit = js.native
  def willSendResponse(o: apolloDashEngineDashReportingLib.Anon_GraphqlResponse): scala.Unit = js.native
}

