package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SZL extends StObject {
  
  var JPY: js.Array[String]
  
  var SZL: js.Array[String]
  
  var USD: js.Array[String]
}
object SZL {
  
  inline def apply(JPY: js.Array[String], SZL: js.Array[String], USD: js.Array[String]): SZL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SZL = SZL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SZL]
  }
  
  extension [Self <: SZL](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setSZL(value: js.Array[String]): Self = StObject.set(x, "SZL", value.asInstanceOf[js.Any])
    
    inline def setSZLVarargs(value: String*): Self = StObject.set(x, "SZL", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
