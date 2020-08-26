package typings.airtable.anon

import typings.airtable.mod.global.Airtable.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Full extends js.Object {
  var full: Thumbnail = js.native
  var large: Thumbnail = js.native
  var small: Thumbnail = js.native
}

object Full {
  @scala.inline
  def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
  @scala.inline
  implicit class FullOps[Self <: Full] (val x: Self) extends AnyVal {
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
    def setFull(value: Thumbnail): Self = this.set("full", value.asInstanceOf[js.Any])
    @scala.inline
    def setLarge(value: Thumbnail): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: Thumbnail): Self = this.set("small", value.asInstanceOf[js.Any])
  }
  
}

