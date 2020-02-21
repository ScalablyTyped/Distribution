package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ViaStop extends js.Object {
  /**
    * 途径车站点ID
    */
  var id: String
  /**
    * 站点经纬度信息
    */
  var location: LngLat
  /**
    * 途径车站点名称
    */
  var name: String
  /**
    * 途径站点的进站时间，如大于24:00,则表示跨天
    */
  var time: Double
  /**
    * 途径站点的停靠时间，单位：分钟
    */
  @JSName("wait")
  var wait_FViaStop: Double
}

object ViaStop {
  @scala.inline
  def apply(id: String, location: LngLat, name: String, time: Double, wait: Double): ViaStop = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], wait = wait.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ViaStop]
  }
}

