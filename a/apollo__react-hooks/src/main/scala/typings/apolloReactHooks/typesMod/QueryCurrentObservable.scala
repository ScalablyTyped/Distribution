package typings.apolloReactHooks.typesMod

import typings.apolloClient.mod.ObservableQuery
import typings.zenObservable.mod.global.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryCurrentObservable[TData, TVariables] extends js.Object {
  var query: js.UndefOr[(ObservableQuery[TData, TVariables]) | Null] = js.native
  var subscription: js.UndefOr[Subscription] = js.native
}

object QueryCurrentObservable {
  @scala.inline
  def apply[TData, TVariables](): QueryCurrentObservable[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryCurrentObservable[TData, TVariables]]
  }
  @scala.inline
  implicit class QueryCurrentObservableOps[Self <: QueryCurrentObservable[_, _], TData, TVariables] (val x: Self with (QueryCurrentObservable[TData, TVariables])) extends AnyVal {
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
    def setQuery(value: ObservableQuery[TData, TVariables]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryNull: Self = this.set("query", null)
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

