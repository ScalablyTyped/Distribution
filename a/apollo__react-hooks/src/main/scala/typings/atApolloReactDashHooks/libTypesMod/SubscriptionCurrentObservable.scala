package typings.atApolloReactDashHooks.libTypesMod

import typings.zenDashObservable.zenDashObservableMod._Global_.ZenObservable.Subscription
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
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (subscription != null) __obj.updateDynamic("subscription")(subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionCurrentObservable]
  }
}

