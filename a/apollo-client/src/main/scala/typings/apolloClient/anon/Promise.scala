package typings.apolloClient.anon

import typings.apolloClient.observableMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Promise extends js.Object {
  var promise: js.Promise[js.Array[_]]
  var subscription: Subscription
}

object Promise {
  @scala.inline
  def apply(promise: js.Promise[js.Array[_]], subscription: Subscription): Promise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[Promise]
  }
}

