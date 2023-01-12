package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XDR extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var XDR: js.Array[String]
}
object XDR {
  
  inline def apply(JPY: js.Array[String], USD: js.Array[String], XDR: js.Array[String]): XDR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XDR = XDR.asInstanceOf[js.Any])
    __obj.asInstanceOf[XDR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XDR] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setXDR(value: js.Array[String]): Self = StObject.set(x, "XDR", value.asInstanceOf[js.Any])
    
    inline def setXDRVarargs(value: String*): Self = StObject.set(x, "XDR", js.Array(value*))
  }
}
