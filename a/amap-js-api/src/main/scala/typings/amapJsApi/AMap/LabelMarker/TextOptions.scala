package typings.amapJsApi.AMap.LabelMarker

import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextOptions extends js.Object {
  var content: js.UndefOr[String] = js.native
  var direction: js.UndefOr[TextDirection] = js.native
  var offset: js.UndefOr[Pixel | (js.Tuple2[Double, Double])] = js.native
  var style: js.UndefOr[TextStyle] = js.native
  var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.native
}

object TextOptions {
  @scala.inline
  def apply(): TextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextOptions]
  }
  @scala.inline
  implicit class TextOptionsOps[Self <: TextOptions] (val x: Self) extends AnyVal {
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
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setDirection(value: TextDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
    @scala.inline
    def setOffset(value: Pixel | (js.Tuple2[Double, Double])): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setStyle(value: TextStyle): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setZooms(value: js.Tuple2[Double, Double]): Self = this.set("zooms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZooms: Self = this.set("zooms", js.undefined)
  }
  
}

