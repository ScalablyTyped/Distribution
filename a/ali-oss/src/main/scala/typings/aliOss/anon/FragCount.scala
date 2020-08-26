package typings.aliOss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragCount extends js.Object {
  var FragCount: Double = js.native
  var FragDuration: Double = js.native
  var PlaylistName: String = js.native
  var Type: String = js.native
}

object FragCount {
  @scala.inline
  def apply(FragCount: Double, FragDuration: Double, PlaylistName: String, Type: String): FragCount = {
    val __obj = js.Dynamic.literal(FragCount = FragCount.asInstanceOf[js.Any], FragDuration = FragDuration.asInstanceOf[js.Any], PlaylistName = PlaylistName.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[FragCount]
  }
  @scala.inline
  implicit class FragCountOps[Self <: FragCount] (val x: Self) extends AnyVal {
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
    def setFragCount(value: Double): Self = this.set("FragCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setFragDuration(value: Double): Self = this.set("FragDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setPlaylistName(value: String): Self = this.set("PlaylistName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
  }
  
}

