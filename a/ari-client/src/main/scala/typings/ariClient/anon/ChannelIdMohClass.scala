package typings.ariClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelIdMohClass extends js.Object {
  var channelId: String = js.native
  var mohClass: js.UndefOr[String] = js.native
}

object ChannelIdMohClass {
  @scala.inline
  def apply(channelId: String): ChannelIdMohClass = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelIdMohClass]
  }
  @scala.inline
  implicit class ChannelIdMohClassOps[Self <: ChannelIdMohClass] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChannelId(value: String): Self = this.set("channelId", value.asInstanceOf[js.Any])
    @scala.inline
    def setMohClass(value: String): Self = this.set("mohClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMohClass: Self = this.set("mohClass", js.undefined)
  }
  
}

