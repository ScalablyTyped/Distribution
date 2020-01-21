package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  /**
    * 城市建议列表
    */
  var cityList: js.UndefOr[js.Array[CityInfo]] = js.undefined
  /**
    * 成功状态说明
    */
  var info: String
  /**
    * 建议关键字列表
    */
  var keywordList: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * 兴趣点列表
    */
  var poiList: PoiList
}

object SearchResult {
  @scala.inline
  def apply(
    info: String,
    poiList: PoiList,
    cityList: js.Array[CityInfo] = null,
    keywordList: js.Array[String] = null
  ): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
    if (cityList != null) __obj.updateDynamic("cityList")(cityList.asInstanceOf[js.Any])
    if (keywordList != null) __obj.updateDynamic("keywordList")(keywordList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
}

