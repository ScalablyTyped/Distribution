package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KHR extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var KHR: js.Array[String]
  
  var LSL: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object KHR {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    KHR: js.Array[String],
    LSL: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): KHR = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KHR = KHR.asInstanceOf[js.Any], LSL = LSL.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KHR]
  }
  
  extension [Self <: KHR](x: Self) {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setKHR(value: js.Array[String]): Self = StObject.set(x, "KHR", value.asInstanceOf[js.Any])
    
    inline def setKHRVarargs(value: String*): Self = StObject.set(x, "KHR", js.Array(value*))
    
    inline def setLSL(value: js.Array[String]): Self = StObject.set(x, "LSL", value.asInstanceOf[js.Any])
    
    inline def setLSLVarargs(value: String*): Self = StObject.set(x, "LSL", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
