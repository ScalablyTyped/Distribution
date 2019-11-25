package typings.apolloDashClient

import typings.apolloDashClient.coreLocalStateMod.LocalState
import typings.apolloDashClient.dataStoreMod.DataStore
import typings.apolloDashLink.apolloDashLinkMod.ApolloLink
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AssumeImmutableResults[TStore] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.undefined
  var clientAwareness: js.UndefOr[Record[String, String]] = js.undefined
  var link: ApolloLink
  var localState: js.UndefOr[LocalState[TStore]] = js.undefined
  var onBroadcast: js.UndefOr[js.Function0[Unit]] = js.undefined
  var queryDeduplication: js.UndefOr[Boolean] = js.undefined
  var ssrMode: js.UndefOr[Boolean] = js.undefined
  var store: DataStore[TStore]
}

object Anon_AssumeImmutableResults {
  @scala.inline
  def apply[TStore](
    link: ApolloLink,
    store: DataStore[TStore],
    assumeImmutableResults: js.UndefOr[Boolean] = js.undefined,
    clientAwareness: Record[String, String] = null,
    localState: LocalState[TStore] = null,
    onBroadcast: () => Unit = null,
    queryDeduplication: js.UndefOr[Boolean] = js.undefined,
    ssrMode: js.UndefOr[Boolean] = js.undefined
  ): Anon_AssumeImmutableResults[TStore] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    if (!js.isUndefined(assumeImmutableResults)) __obj.updateDynamic("assumeImmutableResults")(assumeImmutableResults.asInstanceOf[js.Any])
    if (clientAwareness != null) __obj.updateDynamic("clientAwareness")(clientAwareness.asInstanceOf[js.Any])
    if (localState != null) __obj.updateDynamic("localState")(localState.asInstanceOf[js.Any])
    if (onBroadcast != null) __obj.updateDynamic("onBroadcast")(js.Any.fromFunction0(onBroadcast))
    if (!js.isUndefined(queryDeduplication)) __obj.updateDynamic("queryDeduplication")(queryDeduplication.asInstanceOf[js.Any])
    if (!js.isUndefined(ssrMode)) __obj.updateDynamic("ssrMode")(ssrMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AssumeImmutableResults[TStore]]
  }
}

