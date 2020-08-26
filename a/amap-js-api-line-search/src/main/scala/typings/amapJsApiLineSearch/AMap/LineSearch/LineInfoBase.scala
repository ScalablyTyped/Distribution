package typings.amapJsApiLineSearch.AMap.LineSearch

import typings.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LineInfoBase extends LineInfo {
  /**
    * 所在城市的城市编码
    */
  var citycode: String = js.native
  /**
    * 终点站
    */
  var end_stop: String = js.native
  /**
    * 公交线路id，该id是唯一标识
    */
  var id: String = js.native
  /**
    * 线路名称
    */
  var name: String = js.native
  /**
    * 线路经纬度
    */
  var path: js.Array[LngLat] = js.native
  /**
    * 首发站
    */
  var start_stop: String = js.native
  /**
    * 公交类型列表
    */
  var `type`: String = js.native
}

object LineInfoBase {
  @scala.inline
  def apply(
    citycode: String,
    end_stop: String,
    id: String,
    name: String,
    path: js.Array[LngLat],
    start_stop: String,
    `type`: String
  ): LineInfoBase = {
    val __obj = js.Dynamic.literal(citycode = citycode.asInstanceOf[js.Any], end_stop = end_stop.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_stop = start_stop.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineInfoBase]
  }
  @scala.inline
  implicit class LineInfoBaseOps[Self <: LineInfoBase] (val x: Self) extends AnyVal {
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
    def setCitycode(value: String): Self = this.set("citycode", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd_stop(value: String): Self = this.set("end_stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathVarargs(value: LngLat*): Self = this.set("path", js.Array(value :_*))
    @scala.inline
    def setPath(value: js.Array[LngLat]): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def setStart_stop(value: String): Self = this.set("start_stop", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

