package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssumeImmutableResults[TStore] extends js.Object {
  var assumeImmutableResults: js.UndefOr[scala.Boolean] = js.undefined
  var clientAwareness: js.UndefOr[stdLib.Record[java.lang.String, java.lang.String]] = js.undefined
  var link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink
  var localState: js.UndefOr[apolloDashClientLib.coreLocalStateMod.LocalState[TStore]] = js.undefined
  var onBroadcast: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined
  var ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  var store: apolloDashClientLib.dataStoreMod.DataStore[TStore]
}

object Anon_AssumeImmutableResults {
  @scala.inline
  def apply[TStore](
    link: apolloDashLinkLib.apolloDashLinkMod.ApolloLink,
    store: apolloDashClientLib.dataStoreMod.DataStore[TStore],
    assumeImmutableResults: js.UndefOr[scala.Boolean] = js.undefined,
    clientAwareness: stdLib.Record[java.lang.String, java.lang.String] = null,
    localState: apolloDashClientLib.coreLocalStateMod.LocalState[TStore] = null,
    onBroadcast: () => scala.Unit = null,
    queryDeduplication: js.UndefOr[scala.Boolean] = js.undefined,
    ssrMode: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AssumeImmutableResults[TStore] = {
    val __obj = js.Dynamic.literal(link = link, store = store)
    if (!js.isUndefined(assumeImmutableResults)) __obj.updateDynamic("assumeImmutableResults")(assumeImmutableResults)
    if (clientAwareness != null) __obj.updateDynamic("clientAwareness")(clientAwareness)
    if (localState != null) __obj.updateDynamic("localState")(localState)
    if (onBroadcast != null) __obj.updateDynamic("onBroadcast")(js.Any.fromFunction0(onBroadcast))
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication)
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode)
    __obj.asInstanceOf[Anon_AssumeImmutableResults[TStore]]
  }
}

