package typings.apolloCacheControl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCacheControl.anon.GraphqlResponse
import typings.apolloCacheControl.anon.RequiredCacheHint
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlExtensions.mod.GraphQLExtension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("apollo-cache-control", "CacheControlExtension")
@js.native
class CacheControlExtension[TContext] () extends GraphQLExtension[TContext] {
  def this(options: CacheControlExtensionOptions) = this()
  var defaultMaxAge: js.Any = js.native
  var hints: js.Any = js.native
  var options: CacheControlExtensionOptions = js.native
  var overallCachePolicyOverride: js.UndefOr[js.Any] = js.native
  @JSName("willSendResponse")
  var willSendResponse_CacheControlExtension: js.UndefOr[js.Function1[/* o */ GraphqlResponse, Unit]] = js.native
  def addHint(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsePath */ js.Any,
    hint: CacheHint
  ): Unit = js.native
  def computeOverallCachePolicy(): js.UndefOr[RequiredCacheHint] = js.native
  @JSName("format")
  def format_MCacheControlExtension(): js.UndefOr[js.Tuple2[String, CacheControlFormat]] = js.native
  def overrideOverallCachePolicy(overallCachePolicy: RequiredCacheHint): Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MCacheControlExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): Unit = js.native
}

