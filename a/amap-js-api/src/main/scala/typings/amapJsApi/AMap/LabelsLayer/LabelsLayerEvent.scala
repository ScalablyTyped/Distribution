package typings.amapJsApi.AMap.LabelsLayer

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Pixel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelsLayerEvent[I] extends js.Object {
  var data: EventData = js.native
  var lnglat: LngLat = js.native
  var pixel: Pixel = js.native
  var target: I = js.native
}

object LabelsLayerEvent {
  @scala.inline
  def apply[I](data: EventData, lnglat: LngLat, pixel: Pixel, target: I): LabelsLayerEvent[I] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], pixel = pixel.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelsLayerEvent[I]]
  }
  @scala.inline
  implicit class LabelsLayerEventOps[Self <: LabelsLayerEvent[_], I] (val x: Self with LabelsLayerEvent[I]) extends AnyVal {
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
    def setData(value: EventData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setLnglat(value: LngLat): Self = this.set("lnglat", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixel(value: Pixel): Self = this.set("pixel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: I): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

