package typings.apolloDashClient.coreLocalStateMod

import typings.apolloDashCache.apolloDashCacheMod.ApolloCache
import typings.apolloDashClient.apolloClientMod.default
import typings.apolloDashClient.coreTypesMod.Resolvers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: ApolloCache[TCacheShape]
  var client: js.UndefOr[default[TCacheShape]] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var resolvers: js.UndefOr[Resolvers | js.Array[Resolvers]] = js.undefined
}

object LocalStateOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: ApolloCache[TCacheShape],
    client: default[TCacheShape] = null,
    fragmentMatcher: FragmentMatcher = null,
    resolvers: Resolvers | js.Array[Resolvers] = null
  ): LocalStateOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal(cache = cache)
    if (client != null) __obj.updateDynamic("client")(client)
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(fragmentMatcher)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalStateOptions[TCacheShape]]
  }
}

