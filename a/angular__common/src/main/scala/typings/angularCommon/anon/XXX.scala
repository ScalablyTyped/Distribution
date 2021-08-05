package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XXX extends StObject {
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var XXX: js.Array[scala.Nothing]
}
object XXX {
  
  inline def apply(THB: js.Array[String], TWD: js.Array[String], XXX: js.Array[scala.Nothing]): XXX = {
    val __obj = js.Dynamic.literal(THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[XXX]
  }
  
  extension [Self <: XXX](x: Self) {
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    inline def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    inline def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
