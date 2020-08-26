package typings.amapJsApiHeatmap.AMap.Heatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Data extends js.Object {
  /**
    * 权重
    */
  var count: Double = js.native
  /**
    * 维度
    */
  var lat: Double = js.native
  /**
    * 经度
    */
  var lng: Double = js.native
}

object Data {
  @scala.inline
  def apply(count: Double, lat: Double, lng: Double): Data = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  @scala.inline
  implicit class DataOps[Self <: Data] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setLat(value: Double): Self = this.set("lat", value.asInstanceOf[js.Any])
    @scala.inline
    def setLng(value: Double): Self = this.set("lng", value.asInstanceOf[js.Any])
  }
  
}

