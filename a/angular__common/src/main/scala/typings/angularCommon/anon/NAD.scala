package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NAD extends StObject {
  
  var JPY: js.Array[String]
  
  var NAD: js.Array[String]
  
  var USD: js.Array[String]
}
object NAD {
  
  inline def apply(JPY: js.Array[String], NAD: js.Array[String], USD: js.Array[String]): NAD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NAD]
  }
  
  extension [Self <: NAD](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setNAD(value: js.Array[String]): Self = StObject.set(x, "NAD", value.asInstanceOf[js.Any])
    
    inline def setNADVarargs(value: String*): Self = StObject.set(x, "NAD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
