package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NZD extends StObject {
  
  var JPY: js.Array[String]
  
  var NZD: js.Array[String]
  
  var USD: js.Array[String]
}
object NZD {
  
  inline def apply(JPY: js.Array[String], NZD: js.Array[String], USD: js.Array[String]): NZD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NZD]
  }
  
  extension [Self <: NZD](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setNZD(value: js.Array[String]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    inline def setNZDVarargs(value: String*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
