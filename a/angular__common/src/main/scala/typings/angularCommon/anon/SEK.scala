package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SEK extends StObject {
  
  var JPY: js.Array[String]
  
  var SEK: js.Array[String]
  
  var USD: js.Array[String]
}
object SEK {
  
  inline def apply(JPY: js.Array[String], SEK: js.Array[String], USD: js.Array[String]): SEK = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SEK = SEK.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SEK]
  }
  
  extension [Self <: SEK](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setSEK(value: js.Array[String]): Self = StObject.set(x, "SEK", value.asInstanceOf[js.Any])
    
    inline def setSEKVarargs(value: String*): Self = StObject.set(x, "SEK", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
