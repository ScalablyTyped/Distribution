package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NPR extends StObject {
  
  var JPY: js.Array[String]
  
  var NPR: js.Array[String]
  
  var THB: js.Array[String]
  
  var USD: js.Array[String]
}
object NPR {
  
  inline def apply(JPY: js.Array[String], NPR: js.Array[String], THB: js.Array[String], USD: js.Array[String]): NPR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NPR = NPR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NPR]
  }
  
  extension [Self <: NPR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setNPR(value: js.Array[String]): Self = StObject.set(x, "NPR", value.asInstanceOf[js.Any])
    
    inline def setNPRVarargs(value: String*): Self = StObject.set(x, "NPR", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
