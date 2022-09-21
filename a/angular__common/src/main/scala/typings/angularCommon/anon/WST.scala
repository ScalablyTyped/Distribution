package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WST extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var WST: js.Array[String]
}
object WST {
  
  inline def apply(JPY: js.Array[String], USD: js.Array[String], WST: js.Array[String]): WST = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], WST = WST.asInstanceOf[js.Any])
    __obj.asInstanceOf[WST]
  }
  
  extension [Self <: WST](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setWST(value: js.Array[String]): Self = StObject.set(x, "WST", value.asInstanceOf[js.Any])
    
    inline def setWSTVarargs(value: String*): Self = StObject.set(x, "WST", js.Array(value*))
  }
}
