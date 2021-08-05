package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsIndoorPOI extends StObject {
  
  /**
    * 热点id
    */
  var id: String
  
  // internal
  /**
    * 是否室内热点
    */
  var isIndoorPOI: Boolean
  
  /**
    * 经纬度坐标
    */
  var lnglat: LngLat
  
  /**
    * 热点名称
    */
  var name: String
}
object IsIndoorPOI {
  
  inline def apply(id: String, isIndoorPOI: Boolean, lnglat: LngLat, name: String): IsIndoorPOI = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isIndoorPOI = isIndoorPOI.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIndoorPOI]
  }
  
  extension [Self <: IsIndoorPOI](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsIndoorPOI(value: Boolean): Self = StObject.set(x, "isIndoorPOI", value.asInstanceOf[js.Any])
    
    inline def setLnglat(value: LngLat): Self = StObject.set(x, "lnglat", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
