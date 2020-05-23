package typings.apolloReactHooks.typesMod

import typings.apolloClient.mod.ObservableQuery
import typings.zenObservable.mod.global.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCurrentObservable[TData, TVariables] extends js.Object {
  var query: js.UndefOr[(ObservableQuery[TData, TVariables]) | Null] = js.undefined
  var subscription: js.UndefOr[Subscription] = js.undefined
}

object QueryCurrentObservable {
  @scala.inline
  def apply[TData, TVariables](
    query: js.UndefOr[Null | (ObservableQuery[TData, TVariables])] = js.undefined,
    subscription: Subscription = null
  ): QueryCurrentObservable[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryCurrentObservable[TData, TVariables]]
  }
}

