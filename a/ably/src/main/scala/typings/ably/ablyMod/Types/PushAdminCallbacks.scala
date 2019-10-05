package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushAdminCallbacks extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsCallbacks = js.native
  var deviceRegistrations: PushDeviceRegistrationsCallbacks = js.native
  def publish(recipient: js.Any, payload: js.Any): Unit = js.native
  def publish(recipient: js.Any, payload: js.Any, callback: errorCallback): Unit = js.native
}

