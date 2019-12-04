package typings.apolloDashClient

import typings.apolloDashClient.utilObservableMod.Subscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Promise extends js.Object {
  var promise: js.Promise[js.Array[_]]
  var subscription: Subscription
}

object Anon_Promise {
  @scala.inline
  def apply(promise: js.Promise[js.Array[_]], subscription: Subscription): Anon_Promise = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], subscription = subscription.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Promise]
  }
}

