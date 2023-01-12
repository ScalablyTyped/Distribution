package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYSOS extends StObject {
  
  var BBD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var SOS: js.Array[String]
  
  var USD: js.Array[String]
}
object JPYSOS {
  
  inline def apply(BBD: js.Array[String], JPY: js.Array[String], SOS: js.Array[String], USD: js.Array[String]): JPYSOS = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SOS = SOS.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYSOS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JPYSOS] (val x: Self) extends AnyVal {
    
    inline def setBBD(value: js.Array[String]): Self = StObject.set(x, "BBD", value.asInstanceOf[js.Any])
    
    inline def setBBDVarargs(value: String*): Self = StObject.set(x, "BBD", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setSOS(value: js.Array[String]): Self = StObject.set(x, "SOS", value.asInstanceOf[js.Any])
    
    inline def setSOSVarargs(value: String*): Self = StObject.set(x, "SOS", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
