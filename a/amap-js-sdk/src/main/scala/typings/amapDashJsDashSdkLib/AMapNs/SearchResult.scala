package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResult extends js.Object {
  var cityList: js.Array[CityInfo]
  var info: java.lang.String
  var keywordList: js.Array[java.lang.String]
  var poiList: PoiList
}

object SearchResult {
  @scala.inline
  def apply(
    cityList: js.Array[CityInfo],
    info: java.lang.String,
    keywordList: js.Array[java.lang.String],
    poiList: PoiList
  ): SearchResult = {
    val __obj = js.Dynamic.literal(cityList = cityList, info = info, keywordList = keywordList, poiList = poiList)
  
    __obj.asInstanceOf[SearchResult]
  }
}

