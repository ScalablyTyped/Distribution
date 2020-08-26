package typings.amapJsApi.AMap.Buildings

import typings.amapJsApi.AMap.LocationValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AreaStyle extends js.Object {
  var color1: String = js.native
  var color2: js.UndefOr[String] = js.native
  var path: js.Array[LocationValue] = js.native
  var rejectTexture: js.UndefOr[Boolean] = js.native
  var visible: js.UndefOr[Boolean] = js.native
}

object AreaStyle {
  @scala.inline
  def apply(color1: String, path: js.Array[LocationValue]): AreaStyle = {
    val __obj = js.Dynamic.literal(color1 = color1.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaStyle]
  }
  @scala.inline
  implicit class AreaStyleOps[Self <: AreaStyle] (val x: Self) extends AnyVal {
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
    def setColor1(value: String): Self = this.set("color1", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: LocationValue*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LocationValue]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor2(value: String): Self = this.set("color2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor2: Self = this.set("color2", js.undefined)
    @scala.inline
    def setRejectTexture(value: Boolean): Self = this.set("rejectTexture", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectTexture: Self = this.set("rejectTexture", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

