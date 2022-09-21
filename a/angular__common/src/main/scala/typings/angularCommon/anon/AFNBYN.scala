package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AFNBYN extends StObject {
  
  var AFN: js.Array[String]
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var PKR: js.Array[String]
}
object AFNBYN {
  
  inline def apply(
    AFN: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    PKR: js.Array[String]
  ): AFNBYN = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PKR = PKR.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNBYN]
  }
  
  extension [Self <: AFNBYN](x: Self) {
    
    inline def setAFN(value: js.Array[String]): Self = StObject.set(x, "AFN", value.asInstanceOf[js.Any])
    
    inline def setAFNVarargs(value: String*): Self = StObject.set(x, "AFN", js.Array(value*))
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPKR(value: js.Array[String]): Self = StObject.set(x, "PKR", value.asInstanceOf[js.Any])
    
    inline def setPKRVarargs(value: String*): Self = StObject.set(x, "PKR", js.Array(value*))
  }
}
