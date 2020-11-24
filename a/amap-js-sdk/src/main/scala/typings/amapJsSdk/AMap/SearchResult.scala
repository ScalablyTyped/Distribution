package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends js.Object {
  
  var cityList: js.Array[CityInfo] = js.native
  
  var info: String = js.native
  
  var keywordList: js.Array[String] = js.native
  
  var poiList: PoiList = js.native
}
object SearchResult {
  
  @scala.inline
  def apply(cityList: js.Array[CityInfo], info: String, keywordList: js.Array[String], poiList: PoiList): SearchResult = {
    val __obj = js.Dynamic.literal(cityList = cityList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], keywordList = keywordList.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
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
    def setCityListVarargs(value: CityInfo*): Self = this.set("cityList", js.Array(value :_*))
    
    @scala.inline
    def setCityList(value: js.Array[CityInfo]): Self = this.set("cityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInfo(value: String): Self = this.set("info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordListVarargs(value: String*): Self = this.set("keywordList", js.Array(value :_*))
    
    @scala.inline
    def setKeywordList(value: js.Array[String]): Self = this.set("keywordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoiList(value: PoiList): Self = this.set("poiList", value.asInstanceOf[js.Any])
  }
}
