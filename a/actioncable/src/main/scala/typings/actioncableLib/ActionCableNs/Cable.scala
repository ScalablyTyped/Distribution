package typings
package actioncableLib.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cable extends js.Object {
  var subscriptions: Subscriptions
  def connect(): scala.Unit
  def disconnect(): scala.Unit
  def ensureActiveConnection(): scala.Unit
  def send(data: js.Any): scala.Unit
}

