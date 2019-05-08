package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache-control", "CacheControlExtension")
@js.native
class CacheControlExtension[TContext] ()
  extends graphqlDashExtensionsLib.graphqlDashExtensionsMod.GraphQLExtension[TContext] {
  def this(options: CacheControlExtensionOptions) = this()
  var defaultMaxAge: js.Any = js.native
  var hints: js.Any = js.native
  var options: CacheControlExtensionOptions = js.native
  var overallCachePolicyOverride: js.UndefOr[js.Any] = js.native
  @JSName("willSendResponse")
  var willSendResponse_CacheControlExtension: js.UndefOr[
    js.Function1[/* o */ apolloDashCacheDashControlLib.Anon_GraphqlResponse, scala.Unit]
  ] = js.native
  def addHint(path: graphqlLib.typeDefinitionMod.ResponsePath, hint: CacheHint): scala.Unit = js.native
  def computeOverallCachePolicy(): js.UndefOr[stdLib.Required[CacheHint]] = js.native
  @JSName("format")
  def format_MCacheControlExtension(): js.UndefOr[js.Tuple2[java.lang.String, CacheControlFormat]] = js.native
  def overrideOverallCachePolicy(overallCachePolicy: stdLib.Required[CacheHint]): scala.Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MCacheControlExtension(
    _source: js.Any,
    _args: org.scalablytyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): scala.Unit = js.native
}

