package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewLines extends js.Object {
  var newLines: Double = js.native
  var newStart: Double = js.native
  var oldLines: Double = js.native
  var oldStart: Double = js.native
}

object NewLines {
  @scala.inline
  def apply(newLines: Double, newStart: Double, oldLines: Double, oldStart: Double): NewLines = {
    val __obj = js.Dynamic.literal(newLines = newLines.asInstanceOf[js.Any], newStart = newStart.asInstanceOf[js.Any], oldLines = oldLines.asInstanceOf[js.Any], oldStart = oldStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewLines]
  }
  @scala.inline
  implicit class NewLinesOps[Self <: NewLines] (val x: Self) extends AnyVal {
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
    def setNewLines(value: Double): Self = this.set("newLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewStart(value: Double): Self = this.set("newStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldLines(value: Double): Self = this.set("oldLines", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldStart(value: Double): Self = this.set("oldStart", value.asInstanceOf[js.Any])
  }
  
}

