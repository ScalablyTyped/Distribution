package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BYNCVE extends StObject {
  
  var AUD: js.Array[String]
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var CVE: js.Array[String]
  
  var JPY: js.Array[String]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var RON: js.Array[js.UndefOr[String]]
  
  var THB: js.Array[String]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
}
object BYNCVE {
  
  inline def apply(
    AUD: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    CVE: js.Array[String],
    JPY: js.Array[String],
    PHP: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): BYNCVE = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], CVE = CVE.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BYNCVE]
  }
  
  extension [Self <: BYNCVE](x: Self) {
    
    inline def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value*))
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setCVE(value: js.Array[String]): Self = StObject.set(x, "CVE", value.asInstanceOf[js.Any])
    
    inline def setCVEVarargs(value: String*): Self = StObject.set(x, "CVE", js.Array(value*))
    
    inline def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    inline def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setRON(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "RON", value.asInstanceOf[js.Any])
    
    inline def setRONVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "RON", js.Array(value*))
    
    inline def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    inline def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
  }
}
