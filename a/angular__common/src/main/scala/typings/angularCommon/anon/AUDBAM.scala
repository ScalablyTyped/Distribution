package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUDBAM extends StObject {
  
  var AUD: js.Array[js.UndefOr[String]]
  
  var BAM: js.Array[String]
  
  var BYN: js.Array[js.UndefOr[String]]
  
  var GEL: js.Array[js.UndefOr[String]]
  
  var KRW: js.Array[js.UndefOr[String]]
  
  var NZD: js.Array[js.UndefOr[String]]
  
  var PHP: js.Array[js.UndefOr[String]]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
  
  var VND: js.Array[js.UndefOr[String]]
}
object AUDBAM {
  
  inline def apply(
    AUD: js.Array[js.UndefOr[String]],
    BAM: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    GEL: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    PHP: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): AUDBAM = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BAM = BAM.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], PHP = PHP.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDBAM]
  }
  
  extension [Self <: AUDBAM](x: Self) {
    
    inline def setAUD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    inline def setAUDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "AUD", js.Array(value*))
    
    inline def setBAM(value: js.Array[String]): Self = StObject.set(x, "BAM", value.asInstanceOf[js.Any])
    
    inline def setBAMVarargs(value: String*): Self = StObject.set(x, "BAM", js.Array(value*))
    
    inline def setBYN(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "BYN", value.asInstanceOf[js.Any])
    
    inline def setBYNVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "BYN", js.Array(value*))
    
    inline def setGEL(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "GEL", value.asInstanceOf[js.Any])
    
    inline def setGELVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "GEL", js.Array(value*))
    
    inline def setKRW(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    inline def setKRWVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "KRW", js.Array(value*))
    
    inline def setNZD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    inline def setNZDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "NZD", js.Array(value*))
    
    inline def setPHP(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "PHP", value.asInstanceOf[js.Any])
    
    inline def setPHPVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "PHP", js.Array(value*))
    
    inline def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    inline def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value*))
    
    inline def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    inline def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value*))
    
    inline def setVND(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "VND", value.asInstanceOf[js.Any])
    
    inline def setVNDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "VND", js.Array(value*))
  }
}
