package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SBD extends StObject {
  
  var JPY: js.Array[String]
  
  var SBD: js.Array[String]
  
  var USD: js.Array[String]
}
object SBD {
  
  inline def apply(JPY: js.Array[String], SBD: js.Array[String], USD: js.Array[String]): SBD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SBD]
  }
  
  extension [Self <: SBD](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setSBD(value: js.Array[String]): Self = StObject.set(x, "SBD", value.asInstanceOf[js.Any])
    
    inline def setSBDVarargs(value: String*): Self = StObject.set(x, "SBD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
