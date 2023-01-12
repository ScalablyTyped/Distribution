package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LRD extends StObject {
  
  var JPY: js.Array[String]
  
  var LRD: js.Array[String]
  
  var USD: js.Array[String]
}
object LRD {
  
  inline def apply(JPY: js.Array[String], LRD: js.Array[String], USD: js.Array[String]): LRD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LRD = LRD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LRD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LRD] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setLRD(value: js.Array[String]): Self = StObject.set(x, "LRD", value.asInstanceOf[js.Any])
    
    inline def setLRDVarargs(value: String*): Self = StObject.set(x, "LRD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
