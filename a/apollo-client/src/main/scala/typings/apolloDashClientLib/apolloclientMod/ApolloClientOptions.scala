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

