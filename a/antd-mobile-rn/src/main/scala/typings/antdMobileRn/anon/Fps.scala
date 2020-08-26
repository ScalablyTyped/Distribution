package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fps extends js.Object {
  var fps: Double = js.native
  var leading: Double = js.native
  var loop: Boolean = js.native
  var maxWidth: Double = js.native
  var text: String = js.native
  var trailing: Double = js.native
}

object Fps {
  @scala.inline
  def apply(fps: Double, leading: Double, loop: Boolean, maxWidth: Double, text: String, trailing: Double): Fps = {
    val __obj = js.Dynamic.literal(fps = fps.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], trailing = trailing.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fps]
  }
  @scala.inline
  implicit class FpsOps[Self <: Fps] (val x: Self) extends AnyVal {
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
    def setFps(value: Double): Self = this.set("fps", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoop(value: Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxWidth(value: Double): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrailing(value: Double): Self = this.set("trailing", value.asInstanceOf[js.Any])
  }
  
}

