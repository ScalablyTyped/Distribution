package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushChannelSubscriptionsPromise extends js.Object {
  def list(params: PushChannelSubscriptionParams): js.Promise[PaginatedResult[PushChannelSubscription]]
  def listChannels(params: PushChannelsParams): js.Promise[PaginatedResult[java.lang.String]]
  def remove(subscription: PushChannelSubscription): js.Promise[scala.Unit]
  def removeWhere(params: PushChannelSubscriptionParams): js.Promise[scala.Unit]
  def save(subscription: PushChannelSubscription): js.Promise[PushChannelSubscription]
}

object PushChannelSubscriptionsPromise {
  @scala.inline
  def apply(
    list: js.Function1[
      PushChannelSubscriptionParams, 
      js.Promise[PaginatedResult[PushChannelSubscription]]
    ],
    listChannels: js.Function1[PushChannelsParams, js.Promise[PaginatedResult[java.lang.String]]],
    remove: js.Function1[PushChannelSubscription, js.Promise[scala.Unit]],
    removeWhere: js.Function1[PushChannelSubscriptionParams, js.Promise[scala.Unit]],
    save: js.Function1[PushChannelSubscription, js.Promise[PushChannelSubscription]]
  ): PushChannelSubscriptionsPromise = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(list)
    __obj.updateDynamic("listChannels")(listChannels)
    __obj.updateDynamic("remove")(remove)
    __obj.updateDynamic("removeWhere")(removeWhere)
    __obj.updateDynamic("save")(save)
    __obj.asInstanceOf[PushChannelSubscriptionsPromise]
  }
}

