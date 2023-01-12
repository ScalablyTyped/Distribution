package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PGK extends StObject {
  
  var JPY: js.Array[String]
  
  var PGK: js.Array[String]
  
  var USD: js.Array[String]
}
object PGK {
  
  inline def apply(JPY: js.Array[String], PGK: js.Array[String], USD: js.Array[String]): PGK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], PGK = PGK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[PGK]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PGK] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPGK(value: js.Array[String]): Self = StObject.set(x, "PGK", value.asInstanceOf[js.Any])
    
    inline def setPGKVarargs(value: String*): Self = StObject.set(x, "PGK", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
