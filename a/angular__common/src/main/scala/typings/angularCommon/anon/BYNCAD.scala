package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNCAD extends StObject {
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var CAD: js.Array[js.UndefOr[String]]
  
  var IDR: js.Array[String]
  
  var JPY: js.Array[String]
  
  var MXN: js.Array[js.UndefOr[String]]
  
  var MYR: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[js.UndefOr[String]]
}
object BYNCAD {
  
  inline def apply(
    BYN: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    IDR: js.Array[String],
    JPY: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    MYR: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[js.UndefOr[String]]
  ): BYNCAD = {
    val __obj = js.Dynamic.literal(BYN = BYN.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], IDR = IDR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], MYR = MYR.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNCAD]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BYNCAD] (val x: Self) extends AnyVal {
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setCAD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "CAD", value.asInstanceOf[js.Any])
    
    inline def setCADVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "CAD", js.Array(value*))
    
    inline def setIDR(value: js.Array[String]): Self = StObject.set(x, "IDR", value.asInstanceOf[js.Any])
    
    inline def setIDRVarargs(value: String*): Self = StObject.set(x, "IDR", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setMXN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "MXN", value.asInstanceOf[js.Any])
    
    inline def setMXNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "MXN", js.Array(value*))
    
    inline def setMYR(value: js.Array[String]): Self = StObject.set(x, "MYR", value.asInstanceOf[js.Any])
    
    inline def setMYRVarargs(value: String*): Self = StObject.set(x, "MYR", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
    
    inline def setUSD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
