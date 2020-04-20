package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushAdminPromise extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsPromise
  var deviceRegistrations: PushDeviceRegistrationsPromise
  def publish(recipient: js.Any, payload: js.Any): js.Promise[Unit]
}

object PushAdminPromise {
  @scala.inline
  def apply(
    channelSubscriptions: PushChannelSubscriptionsPromise,
    deviceRegistrations: PushDeviceRegistrationsPromise,
    publish: (js.Any, js.Any) => js.Promise[Unit]
  ): PushAdminPromise = {
    val __obj = js.Dynamic.literal(channelSubscriptions = channelSubscriptions.asInstanceOf[js.Any], deviceRegistrations = deviceRegistrations.asInstanceOf[js.Any], publish = js.Any.fromFunction2(publish))
    __obj.asInstanceOf[PushAdminPromise]
  }
}

