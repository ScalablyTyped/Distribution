package typings.amazonConnectStreams.connect

import typings.amazonConnectStreams.anon.Expiry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionToken extends js.Object {
  val chatTokenTransport: Expiry
}

object ConnectionToken {
  @scala.inline
  def apply(chatTokenTransport: Expiry): ConnectionToken = {
    val __obj = js.Dynamic.literal(chatTokenTransport = chatTokenTransport.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionToken]
  }
}

