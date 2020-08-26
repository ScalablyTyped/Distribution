package typings.apolloClient.anon

import typings.apolloClient.localStateMod.LocalState
import typings.apolloClient.storeMod.DataStore
import typings.apolloLink.mod.ApolloLink
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssumeImmutableResults[TStore] extends js.Object {
  var assumeImmutableResults: js.UndefOr[Boolean] = js.native
  var clientAwareness: js.UndefOr[Record[String, String]] = js.native
  var link: ApolloLink = js.native
  var localState: js.UndefOr[LocalState[TStore]] = js.native
  var onBroadcast: js.UndefOr[js.Function0[Unit]] = js.native
  var queryDeduplication: js.UndefOr[Boolean] = js.native
  var ssrMode: js.UndefOr[Boolean] = js.native
  var store: DataStore[TStore] = js.native
}

object AssumeImmutableResults {
  @scala.inline
  def apply[TStore](link: ApolloLink, store: DataStore[TStore]): AssumeImmutableResults[TStore] = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssumeImmutableResults[TStore]]
  }
  @scala.inline
  implicit class AssumeImmutableResultsOps[Self <: AssumeImmutableResults[_], TStore] (val x: Self with AssumeImmutableResults[TStore]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLink(value: ApolloLink): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setStore(value: DataStore[TStore]): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssumeImmutableResults(value: Boolean): Self = this.set("assumeImmutableResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssumeImmutableResults: Self = this.set("assumeImmutableResults", js.undefined)
    @scala.inline
    def setClientAwareness(value: Record[String, String]): Self = this.set("clientAwareness", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientAwareness: Self = this.set("clientAwareness", js.undefined)
    @scala.inline
    def setLocalState(value: LocalState[TStore]): Self = this.set("localState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalState: Self = this.set("localState", js.undefined)
    @scala.inline
    def setOnBroadcast(value: () => Unit): Self = this.set("onBroadcast", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnBroadcast: Self = this.set("onBroadcast", js.undefined)
    @scala.inline
    def setQueryDeduplication(value: Boolean): Self = this.set("queryDeduplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueryDeduplication: Self = this.set("queryDeduplication", js.undefined)
    @scala.inline
    def setSsrMode(value: Boolean): Self = this.set("ssrMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSsrMode: Self = this.set("ssrMode", js.undefined)
  }
  
}

