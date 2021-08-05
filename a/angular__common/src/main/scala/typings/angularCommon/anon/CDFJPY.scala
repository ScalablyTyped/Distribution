package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CDFJPY extends StObject {
  
  var CDF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object CDFJPY {
  
  inline def apply(CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): CDFJPY = {
    val __obj = js.Dynamic.literal(CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CDFJPY]
  }
  
  extension [Self <: CDFJPY](x: Self) {
    
    inline def setCDF(value: js.Array[String]): Self = StObject.set(x, "CDF", value.asInstanceOf[js.Any])
    
    inline def setCDFVarargs(value: String*): Self = StObject.set(x, "CDF", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
