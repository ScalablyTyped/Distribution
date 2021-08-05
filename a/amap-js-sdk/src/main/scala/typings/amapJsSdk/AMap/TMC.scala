package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TMC extends StObject {
  
  var distance: Double
  
  var lcode: String
  
  var status: String
}
object TMC {
  
  inline def apply(distance: Double, lcode: String, status: String): TMC = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TMC]
  }
  
  extension [Self <: TMC](x: Self) {
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setLcode(value: String): Self = StObject.set(x, "lcode", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
