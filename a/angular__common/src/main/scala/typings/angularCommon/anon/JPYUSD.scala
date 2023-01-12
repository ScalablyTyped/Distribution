package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYUSD extends StObject {
  
  var GNF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYUSD {
  
  inline def apply(GNF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): JPYUSD = {
    val __obj = js.Dynamic.literal(GNF = GNF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYUSD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JPYUSD] (val x: Self) extends AnyVal {
    
    inline def setGNF(value: js.Array[String]): Self = StObject.set(x, "GNF", value.asInstanceOf[js.Any])
    
    inline def setGNFVarargs(value: String*): Self = StObject.set(x, "GNF", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
