package typings
package apolloDashClientLib.apolloclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApolloClientOptions[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  var connectToDevTools: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var fragmentMatcher: js.UndefOr[apolloDashClientLib.coreLocalStateMod.FragmentMatcher] = js.undefined
  var link: js.UndefOr[apolloDashLinkLib.apolloDashLinkMod.ApolloLink] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var resolvers: js.UndefOr[
    apolloDashClientLib.coreTypesMod.Resolvers | js.Array[apolloDashClientLib.coreTypesMod.Resolvers]
  ] = js.undefined
  var ssrForceFetchDelay: js.UndefOr[scala.Double] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  var typeDefs: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | graphqlLib.languageAstMod.DocumentNode | js.Array[graphqlLib.languageAstMod.DocumentNode]
  ] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object ApolloClientOptions {
  @scala.inline
  def apply[TCacheShape](
    cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape],
    connectToDevTools: js.UndefOr[scala.Boolean] = js.undefined,
    defaultOptions: DefaultOptions = null,
    fragmentMatcher: apolloDashClientLib.coreLocalStateMod.FragmentMatcher = null,
    link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink = null,
    name: java.lang.String = null,
    queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined,
    resolvers: apolloDashClientLib.coreTypesMod.Resolvers | js.Array[apolloDashClientLib.coreTypesMod.Resolvers] = null,
    ssrForceFetchDelay: scala.Int | scala.Double = null,
    ssrMode: js.UndefOr[scala.Boolean] = js.undefined,
    typeDefs: java.lang.String | js.Array[java.lang.String] | graphqlLib.languageAstMod.DocumentNode | js.Array[graphqlLib.languageAstMod.DocumentNode] = null,
    version: java.lang.String = null
  ): ApolloClientOptions[TCacheShape] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cache")(cache)
    if (!js.isUndefined(connectToDevTools)) __obj.updateDynamic("connectToDevTools")(connectToDevTools)
    if (defaultOptions != null) __obj.updateDynamic("defaultOptions")(defaultOptions)
    if (fragmentMatcher != null) __obj.updateDynamic("fragmentMatcher")(fragmentMatcher)
    if (link != null) __obj.updateDynamic("link")(link)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication)
    if (resolvers != null) __obj.updateDynamic("resolvers")(resolvers.asInstanceOf[js.Any])
    if (ssrForceFetchDelay != null) __obj.updateDynamic("ssrForceFetchDelay")(ssrForceFetchDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode)
    if (typeDefs != null) __obj.updateDynamic("typeDefs")(typeDefs.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[ApolloClientOptions[TCacheShape]]
  }
}

