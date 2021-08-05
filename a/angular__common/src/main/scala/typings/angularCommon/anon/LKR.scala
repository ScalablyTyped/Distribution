package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LKR extends StObject {
  
  var JPY: js.Array[String]
  
  var LKR: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
  
  var XOF: js.Array[String]
}
object LKR {
  
  inline def apply(
    JPY: js.Array[String],
    LKR: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String],
    XOF: js.Array[String]
  ): LKR = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XOF = XOF.asInstanceOf[js.Any])
    __obj.asInstanceOf[LKR]
  }
  
  extension [Self <: LKR](x: Self) {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setLKR(value: js.Array[String]): Self = StObject.set(x, "LKR", value.asInstanceOf[js.Any])
    
    inline def setLKRVarargs(value: String*): Self = StObject.set(x, "LKR", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    inline def setXOF(value: js.Array[String]): Self = StObject.set(x, "XOF", value.asInstanceOf[js.Any])
    
    inline def setXOFVarargs(value: String*): Self = StObject.set(x, "XOF", js.Array(value :_*))
  }
}
