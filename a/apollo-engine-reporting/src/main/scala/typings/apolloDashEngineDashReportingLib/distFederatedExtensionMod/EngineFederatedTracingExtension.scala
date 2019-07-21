package typings
package apolloDashEngineDashReportingLib.distFederatedExtensionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-engine-reporting/dist/federatedExtension", "EngineFederatedTracingExtension")
@js.native
class EngineFederatedTracingExtension[TContext] protected ()
  extends graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[TContext] {
  def this(options: apolloDashEngineDashReportingLib.Anon_Err) = this()
  var done: js.Any = js.native
  var enabled: js.Any = js.native
  var treeBuilder: js.Any = js.native
  @JSName("didEncounterErrors")
  def didEncounterErrors_MEngineFederatedTracingExtension(errors: js.Array[graphqlLib.graphqlMod.GraphQLError]): scala.Unit = js.native
  @JSName("executionDidStart")
  def executionDidStart_MEngineFederatedTracingExtension(): graphqlDashExtensionsLib.graphqlDashExtensionsMod.EndHandler | scala.Unit = js.native
  @JSName("format")
  def format_MEngineFederatedTracingExtension(): js.UndefOr[js.Tuple2[java.lang.String, java.lang.String]] = js.native
  @JSName("requestDidStart")
  def requestDidStart_MEngineFederatedTracingExtension(o: apolloDashEngineDashReportingLib.Anon_RequestContext[TContext]): scala.Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MEngineFederatedTracingExtension(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): (js.Function2[/* error */ stdLib.Error | scala.Null, /* result */ js.Any, scala.Unit]) | scala.Unit = js.native
}

