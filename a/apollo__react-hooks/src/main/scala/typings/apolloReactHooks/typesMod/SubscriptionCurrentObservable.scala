package typings.apolloReactHooks.typesMod

import typings.zenObservable.mod.global.ZenObservable.Subscription
import typings.zenObservableTs.zenObservableMod.Observable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubscriptionCurrentObservable extends js.Object {
  var query: js.UndefOr[Observable[_]] = js.native
  var subscription: js.UndefOr[Subscription] = js.native
}

object SubscriptionCurrentObservable {
  @scala.inline
  def apply(): SubscriptionCurrentObservable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscriptionCurrentObservable]
  }
  @scala.inline
  implicit class SubscriptionCurrentObservableOps[Self <: SubscriptionCurrentObservable] (val x: Self) extends AnyVal {
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
    def setQuery(value: Observable[_]): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscription: Self = this.set("subscription", js.undefined)
  }
  
}

