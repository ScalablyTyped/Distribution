package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeocodeResult extends StObject {
  
  var geocodes: js.Array[LngLat]
  
  var info: String
  
  var resultNum: Double
}
object GeocodeResult {
  
  inline def apply(geocodes: js.Array[LngLat], info: String, resultNum: Double): GeocodeResult = {
    val __obj = js.Dynamic.literal(geocodes = geocodes.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], resultNum = resultNum.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeocodeResult]
  }
  
  extension [Self <: GeocodeResult](x: Self) {
    
    inline def setGeocodes(value: js.Array[LngLat]): Self = StObject.set(x, "geocodes", value.asInstanceOf[js.Any])
    
    inline def setGeocodesVarargs(value: LngLat*): Self = StObject.set(x, "geocodes", js.Array(value*))
    
    inline def setInfo(value: String): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setResultNum(value: Double): Self = StObject.set(x, "resultNum", value.asInstanceOf[js.Any])
  }
}
