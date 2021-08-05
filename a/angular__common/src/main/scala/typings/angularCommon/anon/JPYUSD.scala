package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYUSD extends StObject {
  
  var AFN: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYUSD {
  
  inline def apply(AFN: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): JPYUSD = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYUSD]
  }
  
  extension [Self <: JPYUSD](x: Self) {
    
    inline def setAFN(value: js.Array[String]): Self = StObject.set(x, "AFN", value.asInstanceOf[js.Any])
    
    inline def setAFNVarargs(value: String*): Self = StObject.set(x, "AFN", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
