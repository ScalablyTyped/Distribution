package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushChannelSubscriptionsCallbacks extends js.Object {
  def list(params: PushChannelSubscriptionParams, callback: paginatedResultCallback[PushChannelSubscription]): scala.Unit = js.native
  def listChannels(params: PushChannelsParams, callback: paginatedResultCallback[java.lang.String]): scala.Unit = js.native
  def remove(subscription: PushChannelSubscription): scala.Unit = js.native
  def remove(subscription: PushChannelSubscription, callback: errorCallback): scala.Unit = js.native
  def removeWhere(params: PushChannelSubscriptionParams): scala.Unit = js.native
  def removeWhere(params: PushChannelSubscriptionParams, callback: errorCallback): scala.Unit = js.native
  def save(subscription: PushChannelSubscription): scala.Unit = js.native
  def save(
    subscription: PushChannelSubscription,
    callback: js.Function2[/* error */ ErrorInfo, /* subscription */ PushChannelSubscription, scala.Unit]
  ): scala.Unit = js.native
}

