package typings.apolloClient.queryManagerMod

import typings.apolloCache.typesCacheMod.Cache.DiffResult
import typings.apolloClient.observableMod.Subscription
import typings.apolloClient.observableQueryMod.ObservableQuery
import typings.apolloClient.typesMod.OperationVariables
import typings.apolloClient.typesMod.QueryListener
import typings.graphql.astMod.DocumentNode
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryInfo extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.native
  var document: DocumentNode | Null = js.native
  var invalidated: Boolean = js.native
  var lastRequestId: Double = js.native
  var listeners: Set[QueryListener] = js.native
  var newData: DiffResult[_] | Null = js.native
  var observableQuery: (ObservableQuery[_, OperationVariables]) | Null = js.native
  var subscriptions: Set[Subscription] = js.native
}

object QueryInfo {
  @scala.inline
  def apply(
    invalidated: Boolean,
    lastRequestId: Double,
    listeners: Set[QueryListener],
    subscriptions: Set[Subscription]
  ): QueryInfo = {
    val __obj = js.Dynamic.literal(invalidated = invalidated.asInstanceOf[js.Any], lastRequestId = lastRequestId.asInstanceOf[js.Any], listeners = listeners.asInstanceOf[js.Any], subscriptions = subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
  @scala.inline
  implicit class QueryInfoOps[Self <: QueryInfo] (val x: Self) extends AnyVal {
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
    def setInvalidated(value: Boolean): Self = this.set("invalidated", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastRequestId(value: Double): Self = this.set("lastRequestId", value.asInstanceOf[js.Any])
    @scala.inline
    def setListeners(value: Set[QueryListener]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptions(value: Set[Subscription]): Self = this.set("subscriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCancel(value: () => Unit): Self = this.set("cancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDocument(value: DocumentNode): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentNull: Self = this.set("document", null)
    @scala.inline
    def setNewData(value: DiffResult[_]): Self = this.set("newData", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewDataNull: Self = this.set("newData", null)
    @scala.inline
    def setObservableQuery(value: ObservableQuery[_, OperationVariables]): Self = this.set("observableQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setObservableQueryNull: Self = this.set("observableQuery", null)
  }
  
}

