package typings.atApolloReactDashHooks.libTypesMod

import typings.apolloDashClient.apolloDashClientMod.ObservableQuery
import typings.zenDashObservable.zenDashObservableMod.Global.ZenObservable.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryCurrentObservable[TData, TVariables] extends js.Object {
  var query: js.UndefOr[(ObservableQuery[TData, TVariables]) | Null] = js.undefined
  var subscription: js.UndefOr[Subscription] = js.undefined
}

object QueryCurrentObservable {
  @scala.inline
  def apply[TData, TVariables](query: ObservableQuery[TData, TVariables] = null, subscription: Subscription = null): QueryCurrentObservable[TData, TVariables] = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[QueryCurrentObservable[TData, TVariables]]
  }
}

