package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PresenceMessageStatic extends js.Object {
  
  def fromEncoded(JsonObject: js.Any): PresenceMessage = js.native
  def fromEncoded(JsonObject: js.Any, channelOptions: ChannelOptions): PresenceMessage = js.native
  
  def fromEncodedArray(JsonArray: js.Array[_]): js.Array[PresenceMessage] = js.native
  def fromEncodedArray(JsonArray: js.Array[_], channelOptions: ChannelOptions): js.Array[PresenceMessage] = js.native
  @JSName("fromEncodedArray")
  var fromEncodedArray_Original: fromEncodedArray[PresenceMessage] = js.native
  
  @JSName("fromEncoded")
  var fromEncoded_Original: fromEncoded[PresenceMessage] = js.native
}
