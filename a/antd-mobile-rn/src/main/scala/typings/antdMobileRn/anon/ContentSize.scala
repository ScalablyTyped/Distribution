package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContentSize extends js.Object {
  var contentSize: HeightWidth = js.native
  var eventCount: Double = js.native
  var target: Double = js.native
  var text: String = js.native
}

object ContentSize {
  @scala.inline
  def apply(contentSize: HeightWidth, eventCount: Double, target: Double, text: String): ContentSize = {
    val __obj = js.Dynamic.literal(contentSize = contentSize.asInstanceOf[js.Any], eventCount = eventCount.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentSize]
  }
  @scala.inline
  implicit class ContentSizeOps[Self <: ContentSize] (val x: Self) extends AnyVal {
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
    def setContentSize(value: HeightWidth): Self = this.set("contentSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventCount(value: Double): Self = this.set("eventCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: Double): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

