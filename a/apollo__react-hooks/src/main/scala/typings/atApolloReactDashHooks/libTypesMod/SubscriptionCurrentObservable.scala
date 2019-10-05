package typings.atApolloReactDashHooks.libTypesMod

import typings.zenDashObservable.zenDashObservableMod.Global.ZenObservable.Subscription
import typings.zenDashObservableDashTs.libZenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionCurrentObservable extends js.Object {
  var query: js.UndefOr[Observable[_]] = js.undefined
  var subscription: js.UndefOr[Subscription] = js.undefined
}

object SubscriptionCurrentObservable {
  @scala.inline
  def apply(query: Observable[_] = null, subscription: Subscription = null): SubscriptionCurrentObservable = {
    val __obj = js.Dynamic.literal()
    if (query != null) __obj.updateDynamic("query")(query)
    if (subscription != null) __obj.updateDynamic("subscription")(subscription)
    __obj.asInstanceOf[SubscriptionCurrentObservable]
  }
}

