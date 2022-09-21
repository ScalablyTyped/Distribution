package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GIP extends StObject {
  
  var GBP: js.Array[String]
  
  var GIP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object GIP {
  
  inline def apply(GBP: js.Array[String], GIP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GIP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], GIP = GIP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIP]
  }
  
  extension [Self <: GIP](x: Self) {
    
    inline def setGBP(value: js.Array[String]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    inline def setGBPVarargs(value: String*): Self = StObject.set(x, "GBP", js.Array(value*))
    
    inline def setGIP(value: js.Array[String]): Self = StObject.set(x, "GIP", value.asInstanceOf[js.Any])
    
    inline def setGIPVarargs(value: String*): Self = StObject.set(x, "GIP", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
