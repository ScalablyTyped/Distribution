package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNCNY extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var CNY: js.Array[String]
  
  var ILP: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object BYNCNY {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    CNY: js.Array[String],
    ILP: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYNCNY = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNCNY]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BYNCNY] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    inline def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value*))
    
    inline def setILP(value: js.Array[String]): Self = StObject.set(x, "ILP", value.asInstanceOf[js.Any])
    
    inline def setILPVarargs(value: String*): Self = StObject.set(x, "ILP", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
