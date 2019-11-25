package typings.amapDashJsDashApiDashStationDashSearch.AMap.StationSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 查该城市无此公交站时，返回的建议城市列表
    */
  var cityList: js.UndefOr[js.Array[CityInfo]] = js.undefined
  /**
    * 成功状态文字描述
    */
  var info: String
  /**
    * 查无此公交站时，返回的建议关键字列表，可根据建议关键字查询
    */
  var keywordList: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 根据查询条件返回公交站点信息
    */
  var stationInfo: js.Array[StationInfo]
}

object SearchResult {
  @scala.inline
  def apply(
    info: String,
    stationInfo: js.Array[StationInfo],
    cityList: js.Array[CityInfo] = null,
    keywordList: js.Array[String] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], stationInfo = stationInfo.asInstanceOf[js.Any])
    if (cityList != null) __obj.updateDynamic("cityList")(cityList.asInstanceOf[js.Any])
    if (keywordList != null) __obj.updateDynamic("keywordList")(keywordList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

