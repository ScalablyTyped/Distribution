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

