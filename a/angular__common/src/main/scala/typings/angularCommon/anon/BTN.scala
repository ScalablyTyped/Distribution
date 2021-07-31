package typings.angularCommon.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BTN extends StObject {
  
  var AUD: js.Array[String]
  
  var BTN: js.Array[String]
  
  var ILS: js.Array[js.UndefOr[String]]
  
  var JPY: js.Array[String]
  
  var KRW: js.Array[String]
  
  var THB: js.Array[String]
  
  var USD: js.Array[String]
  
  var XAF: js.Array[scala.Nothing]
}
object BTN {
  
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BTN: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    KRW: js.Array[String],
    THB: js.Array[String],
    USD: js.Array[String],
    XAF: js.Array[scala.Nothing]
  ): BTN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BTN = BTN.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XAF = XAF.asInstanceOf[js.Any])
    __obj.asInstanceOf[BTN]
  }
  
  @scala.inline
  implicit class BTNMutableBuilder[Self <: BTN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAUD(value: js.Array[String]): Self = StObject.set(x, "AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAUDVarargs(value: String*): Self = StObject.set(x, "AUD", js.Array(value :_*))
    
    @scala.inline
    def setBTN(value: js.Array[String]): Self = StObject.set(x, "BTN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBTNVarargs(value: String*): Self = StObject.set(x, "BTN", js.Array(value :_*))
    
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "ILS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "ILS", js.Array(value :_*))
    
    @scala.inline
    def setJPY(value: js.Array[String]): Self = StObject.set(x, "JPY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJPYVarargs(value: String*): Self = StObject.set(x, "JPY", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[String]): Self = StObject.set(x, "KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: String*): Self = StObject.set(x, "KRW", js.Array(value :_*))
    
    @scala.inline
    def setTHB(value: js.Array[String]): Self = StObject.set(x, "THB", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHBVarargs(value: String*): Self = StObject.set(x, "THB", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[String]): Self = StObject.set(x, "USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: String*): Self = StObject.set(x, "USD", js.Array(value :_*))
    
    @scala.inline
    def setXAF(value: js.Array[scala.Nothing]): Self = StObject.set(x, "XAF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXAFVarargs(value: scala.Nothing*): Self = StObject.set(x, "XAF", js.Array(value :_*))
  }
}
