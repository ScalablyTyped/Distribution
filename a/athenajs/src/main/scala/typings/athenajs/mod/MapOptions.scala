package typings.athenajs.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapOptions extends js.Object {
  var buffer: js.UndefOr[ArrayBuffer] = js.native
  var height: Double = js.native
  var src: String = js.native
  var tileHeight: Double = js.native
  var tileWidth: Double = js.native
  var viewportH: js.UndefOr[Double] = js.native
  var viewportW: js.UndefOr[Double] = js.native
  var width: Double = js.native
}

object MapOptions {
  @scala.inline
  def apply(height: Double, src: String, tileHeight: Double, tileWidth: Double, width: Double): MapOptions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], tileHeight = tileHeight.asInstanceOf[js.Any], tileWidth = tileWidth.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapOptions]
  }
  @scala.inline
  implicit class MapOptionsOps[Self <: MapOptions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrc(value: String): Self = this.set("src", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileHeight(value: Double): Self = this.set("tileHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def setTileWidth(value: Double): Self = this.set("tileWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffer(value: ArrayBuffer): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuffer: Self = this.set("buffer", js.undefined)
    @scala.inline
    def setViewportH(value: Double): Self = this.set("viewportH", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportH: Self = this.set("viewportH", js.undefined)
    @scala.inline
    def setViewportW(value: Double): Self = this.set("viewportW", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteViewportW: Self = this.set("viewportW", js.undefined)
  }
  
}

