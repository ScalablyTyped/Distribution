package typings.amazonConnectStreams.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChatAutoAccept extends js.Object {
  val chatAutoAccept: Boolean
  val connectionData: String
  val customerName: String | Null
}

object ChatAutoAccept {
  @scala.inline
  def apply(chatAutoAccept: Boolean, connectionData: String, customerName: String = null): ChatAutoAccept = {
    val __obj = js.Dynamic.literal(chatAutoAccept = chatAutoAccept.asInstanceOf[js.Any], connectionData = connectionData.asInstanceOf[js.Any], customerName = customerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatAutoAccept]
  }
}

