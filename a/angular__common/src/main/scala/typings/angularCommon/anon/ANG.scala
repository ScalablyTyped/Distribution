package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ANG extends StObject {
  
  var ANG: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object ANG {
  
  inline def apply(ANG: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): ANG = {
    val __obj = js.Dynamic.literal(ANG = ANG.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[ANG]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ANG] (val x: Self) extends AnyVal {
    
    inline def setANG(value: js.Array[String]): Self = StObject.set(x, "ANG", value.asInstanceOf[js.Any])
    
    inline def setANGVarargs(value: String*): Self = StObject.set(x, "ANG", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
