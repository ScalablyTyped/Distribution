package typings.actioncable.ActionCable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subscriptions extends js.Object {
  
  def create(channel: String): Channel = js.native
  def create(channel: String, obj: CreateMixin): Channel = js.native
  def create(channel: ChannelNameWithParams): Channel = js.native
  def create(channel: ChannelNameWithParams, obj: CreateMixin): Channel = js.native
}
