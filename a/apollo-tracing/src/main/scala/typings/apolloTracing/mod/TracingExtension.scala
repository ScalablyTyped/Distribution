package typings.apolloTracing.mod

import org.scalablytyped.runtime.StringDictionary
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlExtensions.mod.GraphQLExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-tracing", "TracingExtension")
@js.native
class TracingExtension[TContext] () extends GraphQLExtension[TContext] {
  var duration: js.UndefOr[js.Any] = js.native
  var endWallTime: js.UndefOr[js.Any] = js.native
  var resolverCalls: js.Any = js.native
  var startHrTime: js.UndefOr[js.Any] = js.native
  var startWallTime: js.UndefOr[js.Any] = js.native
  @JSName("executionDidStart")
  def executionDidStart_MTracingExtension(): js.Function0[Unit] = js.native
  @JSName("format")
  def format_MTracingExtension(): js.UndefOr[js.Tuple2[String, TracingFormat]] = js.native
  @JSName("requestDidStart")
  def requestDidStart_MTracingExtension(): Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MTracingExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): js.Function0[Unit] = js.native
}

