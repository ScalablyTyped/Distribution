package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HUF extends js.Object {
  
  var AUD: js.Array[js.UndefOr[String]] = js.native
  
  var BRL: js.Array[js.UndefOr[String]] = js.native
  
  var CAD: js.Array[js.UndefOr[String]] = js.native
  
  var CNY: js.Array[js.UndefOr[String]] = js.native
  
  var EUR: js.Array[js.UndefOr[String]] = js.native
  
  var GBP: js.Array[js.UndefOr[String]] = js.native
  
  var HKD: js.Array[js.UndefOr[String]] = js.native
  
  var HUF: js.Array[String] = js.native
  
  var ILS: js.Array[js.UndefOr[String]] = js.native
  
  var INR: js.Array[js.UndefOr[String]] = js.native
  
  var KRW: js.Array[js.UndefOr[String]] = js.native
  
  var MXN: js.Array[js.UndefOr[String]] = js.native
  
  var NZD: js.Array[js.UndefOr[String]] = js.native
  
  var TWD: js.Array[js.UndefOr[String]] = js.native
  
  var USD: js.Array[js.UndefOr[String]] = js.native
  
  var VND: js.Array[js.UndefOr[String]] = js.native
  
  var XCD: js.Array[js.UndefOr[String]] = js.native
}
object HUF {
  
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    EUR: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    HUF: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[js.UndefOr[String]],
    VND: js.Array[js.UndefOr[String]],
    XCD: js.Array[js.UndefOr[String]]
  ): HUF = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], EUR = EUR.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], HUF = HUF.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[HUF]
  }
  
  @scala.inline
  implicit class HUFOps[Self <: HUF] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAUDVarargs(value: js.UndefOr[String]*): Self = this.set("AUD", js.Array(value :_*))
    
    @scala.inline
    def setAUD(value: js.Array[js.UndefOr[String]]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBRLVarargs(value: js.UndefOr[String]*): Self = this.set("BRL", js.Array(value :_*))
    
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCADVarargs(value: js.UndefOr[String]*): Self = this.set("CAD", js.Array(value :_*))
    
    @scala.inline
    def setCAD(value: js.Array[js.UndefOr[String]]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCNYVarargs(value: js.UndefOr[String]*): Self = this.set("CNY", js.Array(value :_*))
    
    @scala.inline
    def setCNY(value: js.Array[js.UndefOr[String]]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEURVarargs(value: js.UndefOr[String]*): Self = this.set("EUR", js.Array(value :_*))
    
    @scala.inline
    def setEUR(value: js.Array[js.UndefOr[String]]): Self = this.set("EUR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGBPVarargs(value: js.UndefOr[String]*): Self = this.set("GBP", js.Array(value :_*))
    
    @scala.inline
    def setGBP(value: js.Array[js.UndefOr[String]]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHKDVarargs(value: js.UndefOr[String]*): Self = this.set("HKD", js.Array(value :_*))
    
    @scala.inline
    def setHKD(value: js.Array[js.UndefOr[String]]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHUFVarargs(value: String*): Self = this.set("HUF", js.Array(value :_*))
    
    @scala.inline
    def setHUF(value: js.Array[String]): Self = this.set("HUF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = this.set("ILS", js.Array(value :_*))
    
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINRVarargs(value: js.UndefOr[String]*): Self = this.set("INR", js.Array(value :_*))
    
    @scala.inline
    def setINR(value: js.Array[js.UndefOr[String]]): Self = this.set("INR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = this.set("KRW", js.Array(value :_*))
    
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMXNVarargs(value: js.UndefOr[String]*): Self = this.set("MXN", js.Array(value :_*))
    
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = this.set("NZD", js.Array(value :_*))
    
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTWDVarargs(value: js.UndefOr[String]*): Self = this.set("TWD", js.Array(value :_*))
    
    @scala.inline
    def setTWD(value: js.Array[js.UndefOr[String]]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUSDVarargs(value: js.UndefOr[String]*): Self = this.set("USD", js.Array(value :_*))
    
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = this.set("USD", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVNDVarargs(value: js.UndefOr[String]*): Self = this.set("VND", js.Array(value :_*))
    
    @scala.inline
    def setVND(value: js.Array[js.UndefOr[String]]): Self = this.set("VND", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXCDVarargs(value: js.UndefOr[String]*): Self = this.set("XCD", js.Array(value :_*))
    
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
}
