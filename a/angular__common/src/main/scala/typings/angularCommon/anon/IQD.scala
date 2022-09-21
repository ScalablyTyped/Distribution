package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IQD extends StObject {
  
  var IQD: js.Array[String]
  
  var JPY: js.Array[String]
  
  var USD: js.Array[String]
}
object IQD {
  
  inline def apply(IQD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): IQD = {
    val __obj = js.Dynamic.literal(IQD = IQD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[IQD]
  }
  
  extension [Self <: IQD](x: Self) {
    
    inline def setIQD(value: js.Array[String]): Self = StObject.set(x, "IQD", value.asInstanceOf[js.Any])
    
    inline def setIQDVarargs(value: String*): Self = StObject.set(x, "IQD", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
