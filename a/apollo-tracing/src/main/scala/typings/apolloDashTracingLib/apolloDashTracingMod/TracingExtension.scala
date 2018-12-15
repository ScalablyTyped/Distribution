package typings
package apolloDashTracingLib.apolloDashTracingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @JSImport("apollo-tracing", "TracingExtension")
@js.native
class TracingExtension[TContext] () extends js.Object {
  var duration: js.UndefOr[js.Any] = js.native
  var endWallTime: js.UndefOr[js.Any] = js.native
  var resolverCalls: js.Any = js.native
  var startHrTime: js.UndefOr[js.Any] = js.native
  var startWallTime: js.UndefOr[js.Any] = js.native
  def executionDidStart(): js.Function0[scala.Unit] = js.native
  def format(): js.UndefOr[js.Tuple2[java.lang.String, TracingFormat]] = js.native
  def requestDidStart(): scala.Unit = js.native
  def willResolveField(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): js.Function0[scala.Unit] = js.native
}

