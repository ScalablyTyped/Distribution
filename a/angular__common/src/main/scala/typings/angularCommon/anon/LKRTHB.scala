package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LKRTHB extends StObject {
  
  var LKR: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object LKRTHB {
  
  inline def apply(LKR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): LKRTHB = {
    val __obj = js.Dynamic.literal(LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LKRTHB]
  }
  
  extension [Self <: LKRTHB](x: Self) {
    
    inline def setLKR(value: js.Array[String]): Self = StObject.set(x, "LKR", value.asInstanceOf[js.Any])
    
    inline def setLKRVarargs(value: String*): Self = StObject.set(x, "LKR", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
