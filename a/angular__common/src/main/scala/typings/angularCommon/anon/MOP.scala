package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MOP extends StObject {
  
  var JPY: js.Array[String]
  
  var MOP: js.Array[String]
  
  var USD: js.Array[String]
}
object MOP {
  
  inline def apply(JPY: js.Array[String], MOP: js.Array[String], USD: js.Array[String]): MOP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MOP]
  }
  
  extension [Self <: MOP](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMOP(value: js.Array[String]): Self = StObject.set(x, "MOP", value.asInstanceOf[js.Any])
    
    inline def setMOPVarargs(value: String*): Self = StObject.set(x, "MOP", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
