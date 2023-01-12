package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYMRU extends StObject {
  
  var JPY: js.Array[String]
  
  var MRU: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYMRU {
  
  inline def apply(JPY: js.Array[String], MRU: js.Array[String], USD: js.Array[String]): JPYMRU = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MRU = MRU.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYMRU]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JPYMRU] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMRU(value: js.Array[String]): Self = StObject.set(x, "MRU", value.asInstanceOf[js.Any])
    
    inline def setMRUVarargs(value: String*): Self = StObject.set(x, "MRU", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
