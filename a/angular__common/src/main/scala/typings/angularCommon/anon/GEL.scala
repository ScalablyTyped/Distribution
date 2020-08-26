package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GEL extends js.Object {
  var AUD: js.Array[String] = js.native
  var BEF: js.Array[String] = js.native
  var BYN: js.Array[js.UndefOr[String]] = js.native
  var CAD: js.Array[String] = js.native
  var CYP: js.Array[String] = js.native
  var EGP: js.Array[js.UndefOr[String]] = js.native
  var FRF: js.Array[String] = js.native
  var GEL: js.Array[scala.Nothing] = js.native
  var HKD: js.Array[String] = js.native
  var IEP: js.Array[String] = js.native
  var ILP: js.Array[String] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var ITL: js.Array[String] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var LBP: js.Array[js.UndefOr[String]] = js.native
  var MTP: js.Array[String] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[String] = js.native
  var RHD: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var RWF: js.Array[js.UndefOr[String]] = js.native
  var SGD: js.Array[String] = js.native
  var TOP: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
  var XAF: js.Array[scala.Nothing] = js.native
  var XCD: js.Array[js.UndefOr[String]] = js.native
  var XOF: js.Array[scala.Nothing] = js.native
  var XPF: js.Array[scala.Nothing] = js.native
}

object GEL {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BEF: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    CAD: js.Array[String],
    CYP: js.Array[String],
    EGP: js.Array[js.UndefOr[String]],
    FRF: js.Array[String],
    GEL: js.Array[scala.Nothing],
    HKD: js.Array[String],
    IEP: js.Array[String],
    ILP: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    ITL: js.Array[String],
    KRW: js.Array[js.UndefOr[String]],
    LBP: js.Array[js.UndefOr[String]],
    MTP: js.Array[String],
    MXN: js.Array[js.UndefOr[String]],
    NZD: js.Array[String],
    RHD: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RWF: js.Array[js.UndefOr[String]],
    SGD: js.Array[String],
    TOP: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]],
    XAF: js.Array[scala.Nothing],
    XCD: js.Array[js.UndefOr[String]],
    XOF: js.Array[scala.Nothing],
    XPF: js.Array[scala.Nothing]
  ): GEL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BEF = BEF.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CYP = CYP.asInstanceOf[js.Any], EGP = EGP.asInstanceOf[js.Any], FRF = FRF.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], IEP = IEP.asInstanceOf[js.Any], ILP = ILP.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], ITL = ITL.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], LBP = LBP.asInstanceOf[js.Any], MTP = MTP.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], RHD = RHD.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RWF = RWF.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XAF = XAF.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any], XOF = XOF.asInstanceOf[js.Any], XPF = XPF.asInstanceOf[js.Any])
    __obj.asInstanceOf[GEL]
  }
  @scala.inline
  implicit class GELOps[Self <: GEL] (val x: Self) extends AnyVal {
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
    def setAUDVarargs(value: String*): Self = this.set("AUD", js.Array(value :_*))
    @scala.inline
    def setAUD(value: js.Array[String]): Self = this.set("AUD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBEFVarargs(value: String*): Self = this.set("BEF", js.Array(value :_*))
    @scala.inline
    def setBEF(value: js.Array[String]): Self = this.set("BEF", value.asInstanceOf[js.Any])
    @scala.inline
    def setBYNVarargs(value: js.UndefOr[String]*): Self = this.set("BYN", js.Array(value :_*))
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCADVarargs(value: String*): Self = this.set("CAD", js.Array(value :_*))
    @scala.inline
    def setCAD(value: js.Array[String]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCYPVarargs(value: String*): Self = this.set("CYP", js.Array(value :_*))
    @scala.inline
    def setCYP(value: js.Array[String]): Self = this.set("CYP", value.asInstanceOf[js.Any])
    @scala.inline
    def setEGPVarargs(value: js.UndefOr[String]*): Self = this.set("EGP", js.Array(value :_*))
    @scala.inline
    def setEGP(value: js.Array[js.UndefOr[String]]): Self = this.set("EGP", value.asInstanceOf[js.Any])
    @scala.inline
    def setFRFVarargs(value: String*): Self = this.set("FRF", js.Array(value :_*))
    @scala.inline
    def setFRF(value: js.Array[String]): Self = this.set("FRF", value.asInstanceOf[js.Any])
    @scala.inline
    def setGELVarargs(value: scala.Nothing*): Self = this.set("GEL", js.Array(value :_*))
    @scala.inline
    def setGEL(value: js.Array[scala.Nothing]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKDVarargs(value: String*): Self = this.set("HKD", js.Array(value :_*))
    @scala.inline
    def setHKD(value: js.Array[String]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setIEPVarargs(value: String*): Self = this.set("IEP", js.Array(value :_*))
    @scala.inline
    def setIEP(value: js.Array[String]): Self = this.set("IEP", value.asInstanceOf[js.Any])
    @scala.inline
    def setILPVarargs(value: String*): Self = this.set("ILP", js.Array(value :_*))
    @scala.inline
    def setILP(value: js.Array[String]): Self = this.set("ILP", value.asInstanceOf[js.Any])
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = this.set("ILS", js.Array(value :_*))
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setINRVarargs(value: js.UndefOr[String]*): Self = this.set("INR", js.Array(value :_*))
    @scala.inline
    def setINR(value: js.Array[js.UndefOr[String]]): Self = this.set("INR", value.asInstanceOf[js.Any])
    @scala.inline
    def setITLVarargs(value: String*): Self = this.set("ITL", js.Array(value :_*))
    @scala.inline
    def setITL(value: js.Array[String]): Self = this.set("ITL", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = this.set("KRW", js.Array(value :_*))
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setLBPVarargs(value: js.UndefOr[String]*): Self = this.set("LBP", js.Array(value :_*))
    @scala.inline
    def setLBP(value: js.Array[js.UndefOr[String]]): Self = this.set("LBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setMTPVarargs(value: String*): Self = this.set("MTP", js.Array(value :_*))
    @scala.inline
    def setMTP(value: js.Array[String]): Self = this.set("MTP", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: js.UndefOr[String]*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[js.UndefOr[String]]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: String*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[String]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRHDVarargs(value: String*): Self = this.set("RHD", js.Array(value :_*))
    @scala.inline
    def setRHD(value: js.Array[String]): Self = this.set("RHD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRWFVarargs(value: js.UndefOr[String]*): Self = this.set("RWF", js.Array(value :_*))
    @scala.inline
    def setRWF(value: js.Array[js.UndefOr[String]]): Self = this.set("RWF", value.asInstanceOf[js.Any])
    @scala.inline
    def setSGDVarargs(value: String*): Self = this.set("SGD", js.Array(value :_*))
    @scala.inline
    def setSGD(value: js.Array[String]): Self = this.set("SGD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOPVarargs(value: js.UndefOr[String]*): Self = this.set("TOP", js.Array(value :_*))
    @scala.inline
    def setTOP(value: js.Array[js.UndefOr[String]]): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: js.UndefOr[String]*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[js.UndefOr[String]]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
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
    def setXOFVarargs(value: scala.Nothing*): Self = this.set("XOF", js.Array(value :_*))
    @scala.inline
    def setXOF(value: js.Array[scala.Nothing]): Self = this.set("XOF", value.asInstanceOf[js.Any])
    @scala.inline
    def setXPFVarargs(value: scala.Nothing*): Self = this.set("XPF", js.Array(value :_*))
    @scala.inline
    def setXPF(value: js.Array[scala.Nothing]): Self = this.set("XPF", value.asInstanceOf[js.Any])
  }
  
}

