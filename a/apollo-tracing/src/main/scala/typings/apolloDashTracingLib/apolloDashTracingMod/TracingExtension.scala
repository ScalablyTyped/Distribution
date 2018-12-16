package typings
package apolloDashTracingLib.apolloDashTracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-tracing", "TracingExtension")
@js.native
class TracingExtension[TContext] ()
  extends graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[TContext] {
  var duration: js.UndefOr[js.Any] = js.native
  var endWallTime: js.UndefOr[js.Any] = js.native
  var resolverCalls: js.Any = js.native
  var startHrTime: js.UndefOr[js.Any] = js.native
  var startWallTime: js.UndefOr[js.Any] = js.native
  @JSName("executionDidStart")
  def executionDidStart_MTracingExtension(): js.Function0[scala.Unit] = js.native
  @JSName("format")
  def format_MTracingExtension(): js.UndefOr[js.Tuple2[java.lang.String, TracingFormat]] = js.native
  @JSName("requestDidStart")
  def requestDidStart_MTracingExtension(): scala.Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MTracingExtension(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Function0[scala.Unit] = js.native
}

