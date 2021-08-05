package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BIFJPY extends StObject {
  
  var BIF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object BIFJPY {
  
  inline def apply(BIF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BIFJPY = {
    val __obj = js.Dynamic.literal(BIF = BIF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BIFJPY]
  }
  
  extension [Self <: BIFJPY](x: Self) {
    
    inline def setBIF(value: js.Array[String]): Self = StObject.set(x, "BIF", value.asInstanceOf[js.Any])
    
    inline def setBIFVarargs(value: String*): Self = StObject.set(x, "BIF", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
