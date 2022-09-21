package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MWK extends StObject {
  
  var JPY: js.Array[String]
  
  var MWK: js.Array[String]
  
  var USD: js.Array[String]
}
object MWK {
  
  inline def apply(JPY: js.Array[String], MWK: js.Array[String], USD: js.Array[String]): MWK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MWK = MWK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MWK]
  }
  
  extension [Self <: MWK](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMWK(value: js.Array[String]): Self = StObject.set(x, "MWK", value.asInstanceOf[js.Any])
    
    inline def setMWKVarargs(value: String*): Self = StObject.set(x, "MWK", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
