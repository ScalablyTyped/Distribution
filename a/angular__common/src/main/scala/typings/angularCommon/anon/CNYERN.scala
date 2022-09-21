package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CNYERN extends StObject {
  
  var CNY: js.Array[js.UndefOr[String]]
  
  var ERN: js.Array[String]
  
  var ETB: js.Array[String]
  
  var JPY: js.Array[js.UndefOr[String]]
  
  var USD: js.Array[String]
}
object CNYERN {
  
  inline def apply(
    CNY: js.Array[js.UndefOr[String]],
    ERN: js.Array[String],
    ETB: js.Array[String],
    JPY: js.Array[js.UndefOr[String]],
    USD: js.Array[String]
  ): CNYERN = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], ERN = ERN.asInstanceOf[js.Any], ETB = ETB.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYERN]
  }
  
  extension [Self <: CNYERN](x: Self) {
    
    inline def setCNY(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    inline def setCNYVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "CNY", js.Array(value*))
    
    inline def setERN(value: js.Array[String]): Self = StObject.set(x, "ERN", value.asInstanceOf[js.Any])
    
    inline def setERNVarargs(value: String*): Self = StObject.set(x, "ERN", js.Array(value*))
    
    inline def setETB(value: js.Array[String]): Self = StObject.set(x, "ETB", value.asInstanceOf[js.Any])
    
    inline def setETBVarargs(value: String*): Self = StObject.set(x, "ETB", js.Array(value*))
    
    inline def setJPY(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
