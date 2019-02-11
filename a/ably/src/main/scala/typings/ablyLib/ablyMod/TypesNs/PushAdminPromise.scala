package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PushAdminPromise extends js.Object {
  var channelSubscriptions: PushChannelSubscriptionsPromise
  var deviceRegistrations: PushDeviceRegistrationsPromise
  def publish(recipient: js.Any, payload: js.Any): js.Promise[scala.Unit]
}

