package typings.amapJsApiTransfer.AMap.Transfer

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransitDetails extends js.Object {
  /**
    * 地铁站入口
    */
  var entrance: js.UndefOr[SubwayEntrance] = js.undefined
  /**
    * 地铁站出口
    */
  var exit: js.UndefOr[SubwayEntrance] = js.undefined
  /**
    * 此换乘段公交路线
    */
  var lines: js.Array[TransitLine]
  /**
    * 此换乘段的下车站
    */
  var off_station: Stop
  /**
    * 此换乘段的上车站
    */
  var on_station: Stop
  /**
    * 此换乘段公交部分（上车站-下车站）坐标集合
    */
  var path: js.Array[LngLat]
  /**
    * 途径公交站点数（不包括上车站和下车站）
    */
  var via_num: Double
  /**
    * 途径公交站点集合（不包括上车站和下车站）
    */
  var via_stops: js.Array[Stop]
}

object TransitDetails {
  @scala.inline
  def apply(
    lines: js.Array[TransitLine],
    off_station: Stop,
    on_station: Stop,
    path: js.Array[LngLat],
    via_num: Double,
    via_stops: js.Array[Stop],
    entrance: SubwayEntrance = null,
    exit: SubwayEntrance = null
  ): TransitDetails = {
    val __obj = js.Dynamic.literal(lines = lines.asInstanceOf[js.Any], off_station = off_station.asInstanceOf[js.Any], on_station = on_station.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], via_num = via_num.asInstanceOf[js.Any], via_stops = via_stops.asInstanceOf[js.Any])
    if (entrance != null) __obj.updateDynamic("entrance")(entrance.asInstanceOf[js.Any])
    if (exit != null) __obj.updateDynamic("exit")(exit.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitDetails]
  }
}

