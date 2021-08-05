package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BZDJPY extends StObject {
  
  var BZD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object BZDJPY {
  
  inline def apply(BZD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BZDJPY = {
    val __obj = js.Dynamic.literal(BZD = BZD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BZDJPY]
  }
  
  extension [Self <: BZDJPY](x: Self) {
    
    inline def setBZD(value: js.Array[String]): Self = StObject.set(x, "BZD", value.asInstanceOf[js.Any])
    
    inline def setBZDVarargs(value: String*): Self = StObject.set(x, "BZD", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
