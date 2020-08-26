package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LabelMarker.IconOptions
import typings.amapJsApi.AMap.LabelMarker.TextOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Icon extends js.Object {
  var icon: IconOptions = js.native
  var opacity: Double = js.native
  var text: TextOptions = js.native
  var zIndex: Double = js.native
}

object Icon {
  @scala.inline
  def apply(icon: IconOptions, opacity: Double, text: TextOptions, zIndex: Double): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
  @scala.inline
  implicit class IconOps[Self <: Icon] (val x: Self) extends AnyVal {
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
    def setIcon(value: IconOptions): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpacity(value: Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: TextOptions): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setZIndex(value: Double): Self = this.set("zIndex", value.asInstanceOf[js.Any])
  }
  
}

