package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XCD extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var XCD: js.Array[String]
}
object XCD {
  
  inline def apply(JPY: js.Array[String], USD: js.Array[String], XCD: js.Array[String]): XCD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCD]
  }
  
  extension [Self <: XCD](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    inline def setXCD(value: js.Array[String]): Self = StObject.set(x, "XCD", value.asInstanceOf[js.Any])
    
    inline def setXCDVarargs(value: String*): Self = StObject.set(x, "XCD", js.Array(value :_*))
  }
}
