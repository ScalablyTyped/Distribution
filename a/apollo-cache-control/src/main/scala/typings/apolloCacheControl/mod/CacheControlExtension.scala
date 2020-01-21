package typings.apolloCacheControl.mod

import org.scalablytyped.runtime.StringDictionary
import typings.apolloCacheControl.AnonGraphqlResponse
import typings.graphql.definitionMod.GraphQLResolveInfo
import typings.graphqlExtensions.mod.GraphQLExtension
import typings.std.Required
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
  var willSendResponse_CacheControlExtension: js.UndefOr[js.Function1[/* o */ AnonGraphqlResponse, Unit]] = js.native
  def addHint(
    path: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ResponsePath */ js.Any,
    hint: CacheHint
  ): Unit = js.native
  def computeOverallCachePolicy(): js.UndefOr[Required[CacheHint]] = js.native
  @JSName("format")
  def format_MCacheControlExtension(): js.UndefOr[js.Tuple2[String, CacheControlFormat]] = js.native
  def overrideOverallCachePolicy(overallCachePolicy: Required[CacheHint]): Unit = js.native
  @JSName("willResolveField")
  def willResolveField_MCacheControlExtension(_source: js.Any, _args: StringDictionary[js.Any], _context: TContext, info: GraphQLResolveInfo): Unit = js.native
}

