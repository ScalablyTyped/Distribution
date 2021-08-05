package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SGDTHB extends StObject {
  
  var MYR: js.Array[String]
  
  var SGD: js.Array[String]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
}
object SGDTHB {
  
  inline def apply(
    MYR: js.Array[String],
    SGD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): SGDTHB = {
    val __obj = js.Dynamic.literal(MYR = MYR.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SGDTHB]
  }
  
  extension [Self <: SGDTHB](x: Self) {
    
    inline def setMYR(value: js.Array[String]): Self = StObject.set(x, "MYR", value.asInstanceOf[js.Any])
    
    inline def setMYRVarargs(value: String*): Self = StObject.set(x, "MYR", js.Array(value :_*))
    
    inline def setSGD(value: js.Array[String]): Self = StObject.set(x, "SGD", value.asInstanceOf[js.Any])
    
    inline def setSGDVarargs(value: String*): Self = StObject.set(x, "SGD", js.Array(value :_*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
  }
}
