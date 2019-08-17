package typings.amapDashJsDashApiDashArrivalDashRange.AMapNs.ArrivalRangeNs

import typings.amapDashJsDashApi.AMapNs.LocationValue
import typings.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.coverage
import typings.amapDashJsDashApiDashArrivalDashRange.amapDashJsDashApiDashArrivalDashRangeStrings.polygon
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchOptions extends js.Object {
   // useless
  /**
    * 选择一个想到达的目的地坐标，最多支持5个目的地坐标
    */
  var destination: js.UndefOr[LocationValue | js.Array[LocationValue]] = js.undefined
  /**
    * 公交出行策略,可选为：地铁：SUBWAY， 公交：BUS，多策略使用逗号分隔
    */
  var policy: js.UndefOr[String] = js.undefined
   // 'BUS' | 'SUBWAY' | 'BUS,SUBWAY' | 'SUBWAY,BUS';
  /**
    * 结果返回样式：polygon：返回多边形边界值，coverage：判断设定的终点坐标是否在到达圈范围内
    */
  var resultType: js.UndefOr[polygon | coverage] = js.undefined
}

object SearchOptions {
  @scala.inline
  def apply(
    destination: LocationValue | js.Array[LocationValue] = null,
    policy: String = null,
    resultType: polygon | coverage = null
  ): SearchOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy)
    if (resultType != null) __obj.updateDynamic("resultType")(resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchOptions]
  }
}

