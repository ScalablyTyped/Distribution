package typings.actioncable.ActionCableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subscriptions extends js.Object {
  def create(channel: String, obj: CreateMixin): Channel = js.native
  def create(channel: ChannelNameWithParams, obj: CreateMixin): Channel = js.native
}

