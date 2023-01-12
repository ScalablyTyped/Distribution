package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MVR extends StObject {
  
  var JPY: js.Array[String]
  
  var MVR: js.Array[String]
  
  var USD: js.Array[String]
}
object MVR {
  
  inline def apply(JPY: js.Array[String], MVR: js.Array[String], USD: js.Array[String]): MVR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MVR = MVR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MVR]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MVR] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMVR(value: js.Array[String]): Self = StObject.set(x, "MVR", value.asInstanceOf[js.Any])
    
    inline def setMVRVarargs(value: String*): Self = StObject.set(x, "MVR", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
