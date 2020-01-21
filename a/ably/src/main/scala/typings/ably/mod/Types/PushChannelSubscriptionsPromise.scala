package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscriptionsPromise extends js.Object {
  def list(params: PushChannelSubscriptionParams): js.Promise[PaginatedResult[PushChannelSubscription]]
  def listChannels(params: PushChannelsParams): js.Promise[PaginatedResult[String]]
  def remove(subscription: PushChannelSubscription): js.Promise[Unit]
  def removeWhere(params: PushChannelSubscriptionParams): js.Promise[Unit]
  def save(subscription: PushChannelSubscription): js.Promise[PushChannelSubscription]
}

object PushChannelSubscriptionsPromise {
  @scala.inline
  def apply(
    list: PushChannelSubscriptionParams => js.Promise[PaginatedResult[PushChannelSubscription]],
    listChannels: PushChannelsParams => js.Promise[PaginatedResult[String]],
    remove: PushChannelSubscription => js.Promise[Unit],
    removeWhere: PushChannelSubscriptionParams => js.Promise[Unit],
    save: PushChannelSubscription => js.Promise[PushChannelSubscription]
  ): PushChannelSubscriptionsPromise = {
    val __obj = js.Dynamic.literal(list = js.Any.fromFunction1(list), listChannels = js.Any.fromFunction1(listChannels), remove = js.Any.fromFunction1(remove), removeWhere = js.Any.fromFunction1(removeWhere), save = js.Any.fromFunction1(save))
  
    __obj.asInstanceOf[PushChannelSubscriptionsPromise]
  }
}

