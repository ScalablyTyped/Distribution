package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageStatic extends js.Object {
  @JSName("fromEncodedArray")
  var fromEncodedArray_Original: fromEncodedArray[Message] = js.native
  @JSName("fromEncoded")
  var fromEncoded_Original: fromEncoded[Message] = js.native
  def fromEncoded(JsonObject: js.Any): Message = js.native
  def fromEncoded(JsonObject: js.Any, channelOptions: ChannelOptions): Message = js.native
  def fromEncodedArray(JsonArray: js.Array[_]): js.Array[Message] = js.native
  def fromEncodedArray(JsonArray: js.Array[_], channelOptions: ChannelOptions): js.Array[Message] = js.native
}

