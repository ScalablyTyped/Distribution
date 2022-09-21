package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MUR extends StObject {
  
  var JPY: js.Array[String]
  
  var MUR: js.Array[String]
  
  var USD: js.Array[String]
}
object MUR {
  
  inline def apply(JPY: js.Array[String], MUR: js.Array[String], USD: js.Array[String]): MUR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], MUR = MUR.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[MUR]
  }
  
  extension [Self <: MUR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMUR(value: js.Array[String]): Self = StObject.set(x, "MUR", value.asInstanceOf[js.Any])
    
    inline def setMURVarargs(value: String*): Self = StObject.set(x, "MUR", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
