package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchResult extends StObject {
  
  var cityList: js.Array[CityInfo]
  
  var info: String
  
  var keywordList: js.Array[String]
  
  var poiList: PoiList
}
object SearchResult {
  
  inline def apply(cityList: js.Array[CityInfo], info: String, keywordList: js.Array[String], poiList: PoiList): SearchResult = {
    val __obj = js.Dynamic.literal(cityList = cityList.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], keywordList = keywordList.asInstanceOf[js.Any], poiList = poiList.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResult]
  }
  
  extension [Self <: SearchResult](x: Self) {
    
    inline def setCityList(value: js.Array[CityInfo]): Self = StObject.set(x, "cityList", value.asInstanceOf[js.Any])
    
    inline def setCityListVarargs(value: CityInfo*): Self = StObject.set(x, "cityList", js.Array(value :_*))
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setKeywordList(value: js.Array[String]): Self = StObject.set(x, "keywordList", value.asInstanceOf[js.Any])
    
    inline def setKeywordListVarargs(value: String*): Self = StObject.set(x, "keywordList", js.Array(value :_*))
    
    inline def setPoiList(value: PoiList): Self = StObject.set(x, "poiList", value.asInstanceOf[js.Any])
  }
}
