package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReGeocodeResult extends StObject {
  
  var info: String
  
  var regeocode: ReGeocode
}
object ReGeocodeResult {
  
  inline def apply(info: String, regeocode: ReGeocode): ReGeocodeResult = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], regeocode = regeocode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReGeocodeResult]
  }
  
  extension [Self <: ReGeocodeResult](x: Self) {
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setRegeocode(value: ReGeocode): Self = StObject.set(x, "regeocode", value.asInstanceOf[js.Any])
  }
}
