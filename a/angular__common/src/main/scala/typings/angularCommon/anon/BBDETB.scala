package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BBDETB extends StObject {
  
  var BBD: js.Array[String]
  
  var ETB: js.Array[String]
  
  var JPY: js.Array[String]
  
  var SOS: js.Array[String]
  
  var USD: js.Array[String]
}
object BBDETB {
  
  inline def apply(
    BBD: js.Array[String],
    ETB: js.Array[String],
    JPY: js.Array[String],
    SOS: js.Array[String],
    USD: js.Array[String]
  ): BBDETB = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBDETB]
  }
  
  extension [Self <: BBDETB](x: Self) {
    
    inline def setBBD(value: js.Array[String]): Self = StObject.set(x, "BBD", value.asInstanceOf[js.Any])
    
    inline def setBBDVarargs(value: String*): Self = StObject.set(x, "BBD", js.Array(value :_*))
    
    inline def setETB(value: js.Array[String]): Self = StObject.set(x, "ETB", value.asInstanceOf[js.Any])
    
    inline def setETBVarargs(value: String*): Self = StObject.set(x, "ETB", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setSOS(value: js.Array[String]): Self = StObject.set(x, "SOS", value.asInstanceOf[js.Any])
    
    inline def setSOSVarargs(value: String*): Self = StObject.set(x, "SOS", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
