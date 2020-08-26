package typings.apolloClient.anon

import typings.apolloClient.observableMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise extends js.Object {
  var promise: js.Promise[js.Array[_]] = js.native
  var subscription: Subscription = js.native
}

object Promise {
  @scala.inline
  def apply(promise: js.Promise[js.Array[_]], subscription: Subscription): Promise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
  @scala.inline
  implicit class PromiseOps[Self <: Promise] (val x: Self) extends AnyVal {
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
    def setPromise(value: js.Promise[js.Array[_]]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscription(value: Subscription): Self = this.set("subscription", value.asInstanceOf[js.Any])
  }
  
}

