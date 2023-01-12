package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RWF extends StObject {
  
  var JPY: js.Array[String]
  
  var RWF: js.Array[String]
  
  var USD: js.Array[String]
}
object RWF {
  
  inline def apply(JPY: js.Array[String], RWF: js.Array[String], USD: js.Array[String]): RWF = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[RWF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RWF] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setRWF(value: js.Array[String]): Self = StObject.set(x, "RWF", value.asInstanceOf[js.Any])
    
    inline def setRWFVarargs(value: String*): Self = StObject.set(x, "RWF", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
