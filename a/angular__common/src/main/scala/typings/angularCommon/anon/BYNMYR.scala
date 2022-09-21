package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNMYR extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var MYR: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var SGD: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
}
object BYNMYR {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    SGD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String]
  ): BYNMYR = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNMYR]
  }
  
  extension [Self <: BYNMYR](x: Self) {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setMYR(value: js.Array[String]): Self = StObject.set(x, "MYR", value.asInstanceOf[js.Any])
    
    inline def setMYRVarargs(value: String*): Self = StObject.set(x, "MYR", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setSGD(value: js.Array[String]): Self = StObject.set(x, "SGD", value.asInstanceOf[js.Any])
    
    inline def setSGDVarargs(value: String*): Self = StObject.set(x, "SGD", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
  }
}
