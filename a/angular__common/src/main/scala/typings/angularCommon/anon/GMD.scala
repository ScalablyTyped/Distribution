package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GMD extends StObject {
  
  var GMD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object GMD {
  
  inline def apply(GMD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GMD = {
    val __obj = js.Dynamic.literal(GMD = GMD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GMD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GMD] (val x: Self) extends AnyVal {
    
    inline def setGMD(value: js.Array[String]): Self = StObject.set(x, "GMD", value.asInstanceOf[js.Any])
    
    inline def setGMDVarargs(value: String*): Self = StObject.set(x, "GMD", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
