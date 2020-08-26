package typings.androiduix.android.graphics.Paint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FontMetricsInt extends js.Object {
  var ascent: Double = js.native
  var bottom: Double = js.native
  var descent: Double = js.native
  var leading: Double = js.native
  var top: Double = js.native
}

object FontMetricsInt {
  @scala.inline
  def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double): FontMetricsInt = {
    val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontMetricsInt]
  }
  @scala.inline
  implicit class FontMetricsIntOps[Self <: FontMetricsInt] (val x: Self) extends AnyVal {
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
    def setAscent(value: Double): Self = this.set("ascent", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescent(value: Double): Self = this.set("descent", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeading(value: Double): Self = this.set("leading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

