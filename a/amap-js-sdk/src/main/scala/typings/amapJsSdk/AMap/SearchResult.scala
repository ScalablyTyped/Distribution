package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchResult extends StObject {
  
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
  implicit class SearchResultMutableBuilder[Self <: SearchResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCityList(value: js.Array[CityInfo]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityListVarargs(value: CityInfo*): Self = StObject.set(x, "cityList", js.Array(value :_*))
    
    @scala.inline
    def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordList(value: js.Array[String]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeywordListVarargs(value: String*): Self = StObject.set(x, "keywordList", js.Array(value :_*))
    
    @scala.inline
    def setPoiList(value: PoiList): Self = StObject.set(x, "poiList", value.asInstanceOf[js.Any])
  }
}
