package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SCR extends StObject {
  
  var JPY: js.Array[String]
  
  var SCR: js.Array[String]
  
  var USD: js.Array[String]
}
object SCR {
  
  inline def apply(JPY: js.Array[String], SCR: js.Array[String], USD: js.Array[String]): SCR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SCR = SCR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SCR]
  }
  
  extension [Self <: SCR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setSCR(value: js.Array[String]): Self = StObject.set(x, "SCR", value.asInstanceOf[js.Any])
    
    inline def setSCRVarargs(value: String*): Self = StObject.set(x, "SCR", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
