package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JPYKRW extends StObject {
  
  var AUD: js.Array[String]
  
  var CNY: js.Array[String]
  
  var JPY: js.Array[String]
  
  var KRW: js.Array[String]
  
  var USD: js.Array[String]
  
  var XXX: js.Array[scala.Nothing]
}
object JPYKRW {
  
  inline def apply(
    AUD: js.Array[String],
    CNY: js.Array[String],
    JPY: js.Array[String],
    KRW: js.Array[String],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): JPYKRW = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[JPYKRW]
  }
  
  extension [Self <: JPYKRW](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    inline def setCNY(value: js.Array[String]): Self = StObject.set(x, "CNY", value.asInstanceOf[js.Any])
    
    inline def setCNYVarargs(value: String*): Self = StObject.set(x, "CNY", js.Array(value :_*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    inline def setKRW(value: js.Array[String]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    inline def setKRWVarargs(value: String*): Self = StObject.set(x, "KRW", js.Array(value :_*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    inline def setXXX(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XXX", value.asInstanceOf[js.Any])
    
    inline def setXXXVarargs(value: scala.Nothing*): Self = StObject.set(x, "XXX", js.Array(value :_*))
  }
}
