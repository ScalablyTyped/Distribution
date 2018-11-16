package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_Store[TStore] extends js.Object {
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink
  var onBroadcast: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  var store: apolloDashClientLib.dataStoreMod.DataStore[TStore]
}

