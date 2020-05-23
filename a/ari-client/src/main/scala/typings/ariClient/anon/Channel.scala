package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Channel extends js.Object {
  var bridgeId: String
  var channel: String | js.Array[String]
}

object Channel {
  @scala.inline
  def apply(bridgeId: String, channel: String | js.Array[String]): Channel = {
    val __obj = js.Dynamic.literal(bridgeId = bridgeId.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
    __obj.asInstanceOf[Channel]
  }
}

