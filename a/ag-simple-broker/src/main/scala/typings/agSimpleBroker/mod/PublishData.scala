package typings.agSimpleBroker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishData extends js.Object {
  var channel: String
  var date: js.Any
}

object PublishData {
  @scala.inline
  def apply(channel: String, date: js.Any): PublishData = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PublishData]
  }
}

