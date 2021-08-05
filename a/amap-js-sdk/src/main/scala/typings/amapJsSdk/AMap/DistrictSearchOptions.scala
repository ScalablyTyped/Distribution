package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistrictSearchOptions extends StObject {
  
  var extensions: js.UndefOr[String] = js.undefined
  
  var level: String
  
  var showbiz: js.UndefOr[Boolean] = js.undefined
  
  var subdistrict: js.UndefOr[Double] = js.undefined
}
object DistrictSearchOptions {
  
  inline def apply(level: String): DistrictSearchOptions = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistrictSearchOptions]
  }
  
  extension [Self <: DistrictSearchOptions](x: Self) {
    
    inline def setExtensions(value: String): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setShowbiz(value: Boolean): Self = StObject.set(x, "showbiz", value.asInstanceOf[js.Any])
    
    inline def setShowbizUndefined: Self = StObject.set(x, "showbiz", js.undefined)
    
    inline def setSubdistrict(value: Double): Self = StObject.set(x, "subdistrict", value.asInstanceOf[js.Any])
    
    inline def setSubdistrictUndefined: Self = StObject.set(x, "subdistrict", js.undefined)
  }
}
