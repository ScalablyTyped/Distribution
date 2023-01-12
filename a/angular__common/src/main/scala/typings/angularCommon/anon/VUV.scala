package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VUV extends StObject {
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
  
  var VUV: js.Array[String]
}
object VUV {
  
  inline def apply(JPY: js.Array[String], USD: js.Array[String], VUV: js.Array[String]): VUV = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VUV = VUV.asInstanceOf[js.Any])
    __obj.asInstanceOf[VUV]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VUV] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setVUV(value: js.Array[String]): Self = StObject.set(x, "VUV", value.asInstanceOf[js.Any])
    
    inline def setVUVVarargs(value: String*): Self = StObject.set(x, "VUV", js.Array(value*))
  }
}
