package typings.amapJsSdk.AMap

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
    val __obj = js.Dynamic.literal(cityList = cityList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], keywordList = keywordList.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SearchResult]
  }
}

