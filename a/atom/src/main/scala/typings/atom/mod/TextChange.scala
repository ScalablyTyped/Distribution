package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextChange extends js.Object {
  var newExtent: Point = js.native
  var newRange: Range = js.native
  var newText: String = js.native
  var oldExtent: Point = js.native
  var oldRange: Range = js.native
  var oldText: String = js.native
  var start: Point = js.native
}

object TextChange {
  @scala.inline
  def apply(
    newExtent: Point,
    newRange: Range,
    newText: String,
    oldExtent: Point,
    oldRange: Range,
    oldText: String,
    start: Point
  ): TextChange = {
    val __obj = js.Dynamic.literal(newExtent = newExtent.asInstanceOf[js.Any], newRange = newRange.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any], oldExtent = oldExtent.asInstanceOf[js.Any], oldRange = oldRange.asInstanceOf[js.Any], oldText = oldText.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChange]
  }
  @scala.inline
  implicit class TextChangeOps[Self <: TextChange] (val x: Self) extends AnyVal {
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
    def setNewExtent(value: Point): Self = this.set("newExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewRange(value: Range): Self = this.set("newRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewText(value: String): Self = this.set("newText", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldExtent(value: Point): Self = this.set("oldExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldRange(value: Range): Self = this.set("oldRange", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldText(value: String): Self = this.set("oldText", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart(value: Point): Self = this.set("start", value.asInstanceOf[js.Any])
  }
  
}

