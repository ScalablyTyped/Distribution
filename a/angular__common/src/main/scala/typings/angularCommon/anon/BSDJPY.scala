package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BSDJPY extends StObject {
  
  var BSD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object BSDJPY {
  
  inline def apply(BSD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BSDJPY = {
    val __obj = js.Dynamic.literal(BSD = BSD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BSDJPY]
  }
  
  extension [Self <: BSDJPY](x: Self) {
    
    inline def setBSD(value: js.Array[String]): Self = StObject.set(x, "BSD", value.asInstanceOf[js.Any])
    
    inline def setBSDVarargs(value: String*): Self = StObject.set(x, "BSD", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
