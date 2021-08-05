package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TOP extends StObject {
  
  var JPY: js.Array[String]
  
  var TOP: js.Array[String]
  
  var USD: js.Array[String]
}
object TOP {
  
  inline def apply(JPY: js.Array[String], TOP: js.Array[String], USD: js.Array[String]): TOP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[TOP]
  }
  
  extension [Self <: TOP](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setTOP(value: js.Array[String]): Self = StObject.set(x, "TOP", value.asInstanceOf[js.Any])
    
    inline def setTOPVarargs(value: String*): Self = StObject.set(x, "TOP", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
