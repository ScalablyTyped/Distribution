package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KHR extends StObject {
  
  var JPY: js.Array[String]
  
  var KHR: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object KHR {
  
  inline def apply(JPY: js.Array[String], KHR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): KHR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KHR = KHR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHR]
  }
  
  extension [Self <: KHR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setKHR(value: js.Array[String]): Self = StObject.set(x, "KHR", value.asInstanceOf[js.Any])
    
    inline def setKHRVarargs(value: String*): Self = StObject.set(x, "KHR", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
