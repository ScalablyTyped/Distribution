package typings.amapJsApiArrivalRange.AMap.ArrivalRange

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.coverage
import typings.amapJsApiArrivalRange.amapJsApiArrivalRangeStrings.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchOptions extends js.Object {
   // useless
  /**
    * 选择一个想到达的目的地坐标，最多支持5个目的地坐标
    */
  var destination: js.UndefOr[LocationValue | js.Array[LocationValue]] = js.native
  /**
    * 公交出行策略,可选为：地铁：SUBWAY， 公交：BUS，多策略使用逗号分隔
    */
  var policy: js.UndefOr[String] = js.native
   // 'BUS' | 'SUBWAY' | 'BUS,SUBWAY' | 'SUBWAY,BUS';
  /**
    * 结果返回样式：polygon：返回多边形边界值，coverage：判断设定的终点坐标是否在到达圈范围内
    */
  var resultType: js.UndefOr[polygon | coverage] = js.native
}

object SearchOptions {
  @scala.inline
  def apply(): SearchOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchOptions]
  }
  @scala.inline
  implicit class SearchOptionsOps[Self <: SearchOptions] (val x: Self) extends AnyVal {
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
    def setDestinationVarargs(value: LocationValue*): Self = this.set("destination", js.Array(value :_*))
    @scala.inline
    def setDestination(value: LocationValue | js.Array[LocationValue]): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDestination: Self = this.set("destination", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    @scala.inline
    def setResultType(value: polygon | coverage): Self = this.set("resultType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResultType: Self = this.set("resultType", js.undefined)
  }
  
}

