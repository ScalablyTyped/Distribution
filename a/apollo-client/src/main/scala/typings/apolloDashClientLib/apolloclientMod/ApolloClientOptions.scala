package typings
package apolloDashClientLib.apolloclientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ApolloClientOptions[TCacheShape] extends js.Object {
  var cache: apolloDashCacheLib.apolloDashCacheMod.ApolloCache[TCacheShape]
  var connectToDevTools: js.UndefOr[scala.Boolean] = js.undefined
  var defaultOptions: js.UndefOr[DefaultOptions] = js.undefined
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var ssrForceFetchDelay: js.UndefOr[scala.Double] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
}

