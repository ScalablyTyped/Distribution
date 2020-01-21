package typings.apolloClient

import typings.apolloClient.observableMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPromise extends js.Object {
  var promise: js.Promise[js.Array[_]]
  var subscription: Subscription
}

object AnonPromise {
  @scala.inline
  def apply(promise: js.Promise[js.Array[_]], subscription: Subscription): AnonPromise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPromise]
  }
}

