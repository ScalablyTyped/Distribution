package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UZS extends StObject {
  
  var JPY: js.Array[String]
  
  var THB: js.Array[String]
  
  var USD: js.Array[String]
  
  var UZS: js.Array[String]
}
object UZS {
  
  inline def apply(JPY: js.Array[String], THB: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): UZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UZS]
  }
  
  extension [Self <: UZS](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    inline def setUZS(value: js.Array[String]): Self = StObject.set(x, "UZS", value.asInstanceOf[js.Any])
    
    inline def setUZSVarargs(value: String*): Self = StObject.set(x, "UZS", js.Array(value :_*))
  }
}
