package typings.amapDashJsDashSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var cityList: js.Array[CityInfo]
  var info: String
  var keywordList: js.Array[String]
  var poiList: PoiList
}

object SearchResult {
  @scala.inline
  def apply(cityList: js.Array[CityInfo], info: String, keywordList: js.Array[String], poiList: PoiList): SearchResult = {
    val __obj = js.Dynamic.literal(cityList = cityList, info = info, keywordList = keywordList, poiList = poiList)
  
    __obj.asInstanceOf[SearchResult]
  }
}

