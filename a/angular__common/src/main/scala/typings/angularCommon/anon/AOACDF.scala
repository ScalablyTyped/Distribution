package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AOACDF extends StObject {
  
  var AOA: js.Array[String]
  
  var CDF: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object AOACDF {
  
  inline def apply(AOA: js.Array[String], CDF: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AOACDF = {
    val __obj = js.Dynamic.literal(AOA = AOA.asInstanceOf[js.Any], CDF = CDF.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AOACDF]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AOACDF] (val x: Self) extends AnyVal {
    
    inline def setAOA(value: js.Array[String]): Self = StObject.set(x, "AOA", value.asInstanceOf[js.Any])
    
    inline def setAOAVarargs(value: String*): Self = StObject.set(x, "AOA", js.Array(value*))
    
    inline def setCDF(value: js.Array[String]): Self = StObject.set(x, "CDF", value.asInstanceOf[js.Any])
    
    inline def setCDFVarargs(value: String*): Self = StObject.set(x, "CDF", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
