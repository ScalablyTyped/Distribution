package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FJD extends StObject {
  
  var FJD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object FJD {
  
  inline def apply(FJD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): FJD = {
    val __obj = js.Dynamic.literal(FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[FJD]
  }
  
  extension [Self <: FJD](x: Self) {
    
    inline def setFJD(value: js.Array[String]): Self = StObject.set(x, "FJD", value.asInstanceOf[js.Any])
    
    inline def setFJDVarargs(value: String*): Self = StObject.set(x, "FJD", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
