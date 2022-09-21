package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MGA extends StObject {
  
  var JPY: js.Array[String]
  
  var MGA: js.Array[String]
  
  var USD: js.Array[String]
}
object MGA {
  
  inline def apply(JPY: js.Array[String], MGA: js.Array[String], USD: js.Array[String]): MGA = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MGA = MGA.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MGA]
  }
  
  extension [Self <: MGA](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMGA(value: js.Array[String]): Self = StObject.set(x, "MGA", value.asInstanceOf[js.Any])
    
    inline def setMGAVarargs(value: String*): Self = StObject.set(x, "MGA", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
