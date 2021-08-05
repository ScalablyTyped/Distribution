package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LVL extends StObject {
  
  var AUD: js.Array[String]
  
  var LVL: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object LVL {
  
  inline def apply(AUD: js.Array[String], LVL: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): LVL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], LVL = LVL.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LVL]
  }
  
  extension [Self <: LVL](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    inline def setLVL(value: js.Array[String]): Self = StObject.set(x, "LVL", value.asInstanceOf[js.Any])
    
    inline def setLVLVarargs(value: String*): Self = StObject.set(x, "LVL", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
  }
}
