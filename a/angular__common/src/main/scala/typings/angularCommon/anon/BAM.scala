package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BAM extends StObject {
  
  var BAM: js.Array[String]
  
  var CZK: js.Array[String]
  
  var PLN: js.Array[String]
  
  var RSD: js.Array[String]
  
  var TRY: js.Array[String]
  
  var USD: js.Array[String]
}
object BAM {
  
  inline def apply(
    BAM: js.Array[String],
    CZK: js.Array[String],
    PLN: js.Array[String],
    RSD: js.Array[String],
    TRY: js.Array[String],
    USD: js.Array[String]
  ): BAM = {
    val __obj = js.Dynamic.literal(BAM = BAM.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], RSD = RSD.asInstanceOf[js.Any], TRY = TRY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAM]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BAM] (val x: Self) extends AnyVal {
    
    inline def setBAM(value: js.Array[String]): Self = StObject.set(x, "BAM", value.asInstanceOf[js.Any])
    
    inline def setBAMVarargs(value: String*): Self = StObject.set(x, "BAM", js.Array(value*))
    
    inline def setCZK(value: js.Array[String]): Self = StObject.set(x, "CZK", value.asInstanceOf[js.Any])
    
    inline def setCZKVarargs(value: String*): Self = StObject.set(x, "CZK", js.Array(value*))
    
    inline def setPLN(value: js.Array[String]): Self = StObject.set(x, "PLN", value.asInstanceOf[js.Any])
    
    inline def setPLNVarargs(value: String*): Self = StObject.set(x, "PLN", js.Array(value*))
    
    inline def setRSD(value: js.Array[String]): Self = StObject.set(x, "RSD", value.asInstanceOf[js.Any])
    
    inline def setRSDVarargs(value: String*): Self = StObject.set(x, "RSD", js.Array(value*))
    
    inline def setTRY(value: js.Array[String]): Self = StObject.set(x, "TRY", value.asInstanceOf[js.Any])
    
    inline def setTRYVarargs(value: String*): Self = StObject.set(x, "TRY", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
