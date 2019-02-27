package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientAwareness[TStore] extends js.Object {
  var clientAwareness: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink
  var localState: js.UndefOr[apolloDashClientLib.coreLocalStateMod.LocalState[TStore]] = js.undefined
  var onBroadcast: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  var store: apolloDashClientLib.dataStoreMod.DataStore[TStore]
}

