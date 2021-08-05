package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MYR extends StObject {
  
  var JPY: js.Array[String]
  
  var MYR: js.Array[String]
  
  var USD: js.Array[String]
}
object MYR {
  
  inline def apply(JPY: js.Array[String], MYR: js.Array[String], USD: js.Array[String]): MYR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MYR]
  }
  
  extension [Self <: MYR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setMYR(value: js.Array[String]): Self = StObject.set(x, "MYR", value.asInstanceOf[js.Any])
    
    inline def setMYRVarargs(value: String*): Self = StObject.set(x, "MYR", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
