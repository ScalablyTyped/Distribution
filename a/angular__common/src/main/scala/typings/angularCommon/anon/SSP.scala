package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSP extends StObject {
  
  var GBP: js.Array[String]
  
  var JPY: js.Array[String]
  
  var SSP: js.Array[String]
  
  var USD: js.Array[String]
}
object SSP {
  
  inline def apply(GBP: js.Array[String], JPY: js.Array[String], SSP: js.Array[String], USD: js.Array[String]): SSP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], SSP = SSP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSP]
  }
  
  extension [Self <: SSP](x: Self) {
    
    inline def setGBP(value: js.Array[String]): Self = StObject.set(x, "GBP", value.asInstanceOf[js.Any])
    
    inline def setGBPVarargs(value: String*): Self = StObject.set(x, "GBP", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setSSP(value: js.Array[String]): Self = StObject.set(x, "SSP", value.asInstanceOf[js.Any])
    
    inline def setSSPVarargs(value: String*): Self = StObject.set(x, "SSP", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
