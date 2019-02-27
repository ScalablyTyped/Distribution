package typings
package apolloDashClientLib.coreLocalStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalStateOptions[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  var client: js.UndefOr[apolloDashClientLib.apolloclientMod.default[TCacheShape]] = js.undefined
  var fragmentMatcher: js.UndefOr[FragmentMatcher] = js.undefined
  var resolvers: js.UndefOr[
    apolloDashClientLib.coreTypesMod.Resolvers | js.Array[apolloDashClientLib.coreTypesMod.Resolvers]
  ] = js.undefined
}

