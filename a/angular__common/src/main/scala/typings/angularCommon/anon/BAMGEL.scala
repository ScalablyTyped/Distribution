package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BAMGEL extends StObject {
  
  var AUD: js.Array[js.UndefOr[String]]
  
  var BAM: js.Array[String]
  
  var GEL: js.Array[js.UndefOr[String]]
  
  var KRW: js.Array[js.UndefOr[String]]
  
  var NZD: js.Array[js.UndefOr[String]]
  
  var TWD: js.Array[String]
  
  var USD: js.Array[String]
  
  var VND: js.Array[js.UndefOr[String]]
}
object BAMGEL {
  
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BAM: js.Array[String],
    GEL: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): BAMGEL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BAM = BAM.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAMGEL]
  }
  
  @scala.inline
  implicit class BAMGELMutableBuilder[Self <: BAMGEL] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setBAM(value: js.Array[String]): Self = StObject.set(x, "BAM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBAMVarargs(value: String*): Self = StObject.set(x, "BAM", js.Array(value :_*))
    
    @scala.inline
    def setGEL(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "GEL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGELVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "GEL", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "KRW", js.Array(value :_*))
    
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "NZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "NZD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[String]): Self = StObject.set(x, "TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: String*): Self = StObject.set(x, "TWD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setVND(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "VND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVNDVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "VND", js.Array(value :_*))
  }
}
