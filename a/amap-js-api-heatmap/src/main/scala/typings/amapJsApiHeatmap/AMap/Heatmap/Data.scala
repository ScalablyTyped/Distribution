package typings.amapJsApiHeatmap.AMap.Heatmap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  /**
    * 权重
    */
  var count: Double
  /**
    * 维度
    */
  var lat: Double
  /**
    * 经度
    */
  var lng: Double
}

object Data {
  @scala.inline
  def apply(count: Double, lat: Double, lng: Double): Data = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

