package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tip extends StObject {
  
  var adcode: String
  
  var district: String
  
  var name: String
}
object Tip {
  
  inline def apply(adcode: String, district: String, name: String): Tip = {
    val __obj = js.Dynamic.literal(adcode = adcode.asInstanceOf[js.Any], district = district.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tip]
  }
  
  extension [Self <: Tip](x: Self) {
    
    inline def setAdcode(value: String): Self = StObject.set(x, "adcode", value.asInstanceOf[js.Any])
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
