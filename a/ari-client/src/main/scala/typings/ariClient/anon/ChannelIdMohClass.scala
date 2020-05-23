package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelIdMohClass extends js.Object {
  var channelId: String
  var mohClass: js.UndefOr[String] = js.undefined
}

object ChannelIdMohClass {
  @scala.inline
  def apply(channelId: String, mohClass: String = null): ChannelIdMohClass = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    if (mohClass != null) __obj.updateDynamic("mohClass")(mohClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdMohClass]
  }
}

