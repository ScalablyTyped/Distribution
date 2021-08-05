package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MZN extends StObject {
  
  var JPY: js.Array[String]
  
  var MZN: js.Array[String]
  
  var USD: js.Array[String]
}
object MZN {
  
  inline def apply(JPY: js.Array[String], MZN: js.Array[String], USD: js.Array[String]): MZN = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MZN = MZN.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MZN]
  }
  
  extension [Self <: MZN](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setMZN(value: js.Array[String]): Self = StObject.set(x, "MZN", value.asInstanceOf[js.Any])
    
    inline def setMZNVarargs(value: String*): Self = StObject.set(x, "MZN", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
