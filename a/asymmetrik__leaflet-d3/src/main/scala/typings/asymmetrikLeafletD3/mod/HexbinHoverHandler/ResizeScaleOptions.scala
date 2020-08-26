package typings.asymmetrikLeafletD3.mod.HexbinHoverHandler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResizeScaleOptions extends js.Object {
  var radiusScale: Double = js.native
}

object ResizeScaleOptions {
  @scala.inline
  def apply(radiusScale: Double): ResizeScaleOptions = {
    val __obj = js.Dynamic.literal(radiusScale = radiusScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeScaleOptions]
  }
  @scala.inline
  implicit class ResizeScaleOptionsOps[Self <: ResizeScaleOptions] (val x: Self) extends AnyVal {
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
    def setRadiusScale(value: Double): Self = this.set("radiusScale", value.asInstanceOf[js.Any])
  }
  
}

