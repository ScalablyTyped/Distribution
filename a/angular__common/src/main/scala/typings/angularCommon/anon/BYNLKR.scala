package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNLKR extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var LKR: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object BYNLKR {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    LKR: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYNLKR = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], LKR = LKR.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNLKR]
  }
  
  extension [Self <: BYNLKR](x: Self) {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setLKR(value: js.Array[String]): Self = StObject.set(x, "LKR", value.asInstanceOf[js.Any])
    
    inline def setLKRVarargs(value: String*): Self = StObject.set(x, "LKR", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
