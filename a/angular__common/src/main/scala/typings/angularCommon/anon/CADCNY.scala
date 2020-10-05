package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CADCNY extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var BRL: js.Array[js.UndefOr[String]] = js.native
  var CAD: js.Array[js.UndefOr[String]] = js.native
  var CNY: js.Array[js.UndefOr[String]] = js.native
  var HKD: js.Array[js.UndefOr[String]] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var NOK: js.Array[String] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[js.UndefOr[String]] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
  var XAF: js.Array[scala.Nothing] = js.native
  var XCD: js.Array[js.UndefOr[String]] = js.native
  var XPF: js.Array[scala.Nothing] = js.native
  var XXX: js.Array[scala.Nothing] = js.native
}

object CADCNY {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BRL: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NOK: js.Array[String],
    NZD: js.Array[js.UndefOr[String]],
    RON: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[js.UndefOr[String]],
    VND: js.Array[js.UndefOr[String]],
    XAF: js.Array[scala.Nothing],
    XCD: js.Array[js.UndefOr[String]],
    XPF: js.Array[scala.Nothing],
    XXX: js.Array[scala.Nothing]
  ): CADCNY = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XAF = XAF.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[CADCNY]
  }
  @scala.inline
  implicit class CADCNYOps[Self <: CADCNY] (val x: Self) extends AnyVal {
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
    def setHKDVarargs(value: js.UndefOr[String]*): Self = this.set("HKD", js.Array(value :_*))
    @scala.inline
    def setHKD(value: js.Array[js.UndefOr[String]]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = this.set("ILS", js.Array(value :_*))
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setINRVarargs(value: js.UndefOr[String]*): Self = this.set("INR", js.Array(value :_*))
    @scala.inline
    def setINR(value: js.Array[js.UndefOr[String]]): Self = this.set("INR", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: js.UndefOr[String]*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[js.UndefOr[String]]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = this.set("KRW", js.Array(value :_*))
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: js.UndefOr[String]*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNOKVarargs(value: String*): Self = this.set("NOK", js.Array(value :_*))
    @scala.inline
    def setNOK(value: js.Array[String]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
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
    def setXAFVarargs(value: scala.Nothing*): Self = this.set("XAF", js.Array(value :_*))
    @scala.inline
    def setXAF(value: js.Array[scala.Nothing]): Self = this.set("XAF", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCDVarargs(value: js.UndefOr[String]*): Self = this.set("XCD", js.Array(value :_*))
    @scala.inline
    def setXCD(value: js.Array[js.UndefOr[String]]): Self = this.set("XCD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPFVarargs(value: scala.Nothing*): Self = this.set("XPF", js.Array(value :_*))
    @scala.inline
    def setXPF(value: js.Array[scala.Nothing]): Self = this.set("XPF", value.asInstanceOf[js.Any])
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
  
}

