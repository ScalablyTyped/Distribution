package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KYD extends StObject {
  
  var JPY: js.Array[String]
  
  var KYD: js.Array[String]
  
  var USD: js.Array[String]
}
object KYD {
  
  inline def apply(JPY: js.Array[String], KYD: js.Array[String], USD: js.Array[String]): KYD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], KYD = KYD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[KYD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KYD] (val x: Self) extends AnyVal {
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setKYD(value: js.Array[String]): Self = StObject.set(x, "KYD", value.asInstanceOf[js.Any])
    
    inline def setKYDVarargs(value: String*): Self = StObject.set(x, "KYD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
