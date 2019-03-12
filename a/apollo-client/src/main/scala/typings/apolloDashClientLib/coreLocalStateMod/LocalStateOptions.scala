package typings
package apolloDashClientLib.coreLocalStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  var client: js.UndefOr[apolloDashClientLib.apolloClientMod.default[TCacheShape]] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var resolvers: js.UndefOr[
    apolloDashClientLib.coreTypesMod.Resolvers | js.Array[apolloDashClientLib.coreTypesMod.Resolvers]
  ] = js.undefined
}

object LocalStateOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape],
    client: apolloDashClientLib.apolloClientMod.default[TCacheShape] = null,
    fragmentMatcher: FragmentMatcher = null,
    resolvers: apolloDashClientLib.coreTypesMod.Resolvers | js.Array[apolloDashClientLib.coreTypesMod.Resolvers] = null
  ): LocalStateOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache)
    if (client != null) __obj.updateDynamic("client")(client)
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(fragmentMatcher)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStateOptions[TCacheShape]]
  }
}

