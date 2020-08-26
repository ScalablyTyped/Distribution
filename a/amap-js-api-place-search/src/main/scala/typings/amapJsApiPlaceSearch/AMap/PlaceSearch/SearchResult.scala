package typings.amapJsApiPlaceSearch.AMap.PlaceSearch

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchResult extends js.Object {
  /**
    * 城市建议列表
    */
  var cityList: js.UndefOr[js.Array[CityInfo]] = js.native
  /**
    * 成功状态说明
    */
  var info: String = js.native
  /**
    * 建议关键字列表
    */
  var keywordList: js.UndefOr[js.Array[String]] = js.native
  /**
    * 兴趣点列表
    */
  var poiList: PoiList = js.native
}

object SearchResult {
  @scala.inline
  def apply(info: String, poiList: PoiList): SearchResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  @scala.inline
  implicit class SearchResultOps[Self <: SearchResult] (val x: Self) extends AnyVal {
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
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoiList(value: PoiList): Self = this.set("poiList", value.asInstanceOf[js.Any])
    @scala.inline
    def setCityListVarargs(value: CityInfo*): Self = this.set("cityList", js.Array(value :_*))
    @scala.inline
    def setCityList(value: js.Array[CityInfo]): Self = this.set("cityList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCityList: Self = this.set("cityList", js.undefined)
    @scala.inline
    def setKeywordListVarargs(value: String*): Self = this.set("keywordList", js.Array(value :_*))
    @scala.inline
    def setKeywordList(value: js.Array[String]): Self = this.set("keywordList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeywordList: Self = this.set("keywordList", js.undefined)
  }
  
}

