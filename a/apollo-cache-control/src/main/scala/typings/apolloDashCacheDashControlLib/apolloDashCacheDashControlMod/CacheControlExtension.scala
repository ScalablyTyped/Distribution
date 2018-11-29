package typings
package apolloDashCacheDashControlLib.apolloDashCacheDashControlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveDifficultInheritance: 
- Dropped any */ @JSImport("apollo-cache-control", "CacheControlExtension")
@js.native
class CacheControlExtension[TContext] () extends js.Object {
  def this(options: CacheControlExtensionOptions) = this()
  var defaultMaxAge: js.Any = js.native
  var hints: js.Any = js.native
  var options: CacheControlExtensionOptions = js.native
  var willSendResponse: js.UndefOr[
    js.Function1[/* o */ apolloDashCacheDashControlLib.Anon_GraphqlResponse, scala.Unit]
  ] = js.native
  def addHint(path: graphqlLib.typeDefinitionMod.ResponsePath, hint: CacheHint): scala.Unit = js.native
  def computeOverallCachePolicy(): js.UndefOr[stdLib.Required[CacheHint]] = js.native
  def format(): js.UndefOr[js.Tuple2[java.lang.String, CacheControlFormat]] = js.native
  def willResolveField(
    _source: js.Any,
    _args: ScalablyTyped.runtime.StringDictionary[js.Any],
    _context: TContext,
    info: graphqlLib.typeDefinitionMod.GraphQLResolveInfo
  ): scala.Unit = js.native
}

