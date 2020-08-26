package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BRL extends js.Object {
  var AUD: js.Array[String] = js.native
  var BBD: js.Array[js.UndefOr[String]] = js.native
  var BMD: js.Array[js.UndefOr[String]] = js.native
  var BRL: js.Array[js.UndefOr[String]] = js.native
  var BSD: js.Array[js.UndefOr[String]] = js.native
  var BYN: js.Array[String] = js.native
  var BZD: js.Array[js.UndefOr[String]] = js.native
  var CAD: js.Array[js.UndefOr[String]] = js.native
  var CUC: js.Array[js.UndefOr[String]] = js.native
  var CUP: js.Array[js.UndefOr[String]] = js.native
  var DOP: js.Array[js.UndefOr[String]] = js.native
  var FJD: js.Array[js.UndefOr[String]] = js.native
  var FKP: js.Array[js.UndefOr[String]] = js.native
  var GYD: js.Array[js.UndefOr[String]] = js.native
  var ISK: js.Array[js.UndefOr[String]] = js.native
  var JMD: js.Array[js.UndefOr[String]] = js.native
  var KYD: js.Array[js.UndefOr[String]] = js.native
  var LRD: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[String] = js.native
  var NAD: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var RUB: js.Array[String] = js.native
  var SBD: js.Array[js.UndefOr[String]] = js.native
  var SGD: js.Array[js.UndefOr[String]] = js.native
  var TTD: js.Array[js.UndefOr[String]] = js.native
  var UYU: js.Array[js.UndefOr[String]] = js.native
  var XCD: js.Array[String] = js.native
}

object BRL {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    BBD: js.Array[js.UndefOr[String]],
    BMD: js.Array[js.UndefOr[String]],
    BRL: js.Array[js.UndefOr[String]],
    BSD: js.Array[js.UndefOr[String]],
    BYN: js.Array[String],
    BZD: js.Array[js.UndefOr[String]],
    CAD: js.Array[js.UndefOr[String]],
    CUC: js.Array[js.UndefOr[String]],
    CUP: js.Array[js.UndefOr[String]],
    DOP: js.Array[js.UndefOr[String]],
    FJD: js.Array[js.UndefOr[String]],
    FKP: js.Array[js.UndefOr[String]],
    GYD: js.Array[js.UndefOr[String]],
    ISK: js.Array[js.UndefOr[String]],
    JMD: js.Array[js.UndefOr[String]],
    KYD: js.Array[js.UndefOr[String]],
    LRD: js.Array[js.UndefOr[String]],
    MXN: js.Array[String],
    NAD: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    SBD: js.Array[js.UndefOr[String]],
    SGD: js.Array[js.UndefOr[String]],
    TTD: js.Array[js.UndefOr[String]],
    UYU: js.Array[js.UndefOr[String]],
    XCD: js.Array[String]
  ): BRL = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BBD = BBD.asInstanceOf[js.Any], BMD = BMD.asInstanceOf[js.Any], BRL = BRL.asInstanceOf[js.Any], BSD = BSD.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], BZD = BZD.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CUC = CUC.asInstanceOf[js.Any], CUP = CUP.asInstanceOf[js.Any], DOP = DOP.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], FKP = FKP.asInstanceOf[js.Any], GYD = GYD.asInstanceOf[js.Any], ISK = ISK.asInstanceOf[js.Any], JMD = JMD.asInstanceOf[js.Any], KYD = KYD.asInstanceOf[js.Any], LRD = LRD.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], TTD = TTD.asInstanceOf[js.Any], UYU = UYU.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BRL]
  }
  @scala.inline
  implicit class BRLOps[Self <: BRL] (val x: Self) extends AnyVal {
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
    def setBBDVarargs(value: js.UndefOr[String]*): Self = this.set("BBD", js.Array(value :_*))
    @scala.inline
    def setBBD(value: js.Array[js.UndefOr[String]]): Self = this.set("BBD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBMDVarargs(value: js.UndefOr[String]*): Self = this.set("BMD", js.Array(value :_*))
    @scala.inline
    def setBMD(value: js.Array[js.UndefOr[String]]): Self = this.set("BMD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBRLVarargs(value: js.UndefOr[String]*): Self = this.set("BRL", js.Array(value :_*))
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBSDVarargs(value: js.UndefOr[String]*): Self = this.set("BSD", js.Array(value :_*))
    @scala.inline
    def setBSD(value: js.Array[js.UndefOr[String]]): Self = this.set("BSD", value.asInstanceOf[js.Any])
    @scala.inline
    def setBYNVarargs(value: String*): Self = this.set("BYN", js.Array(value :_*))
    @scala.inline
    def setBYN(value: js.Array[String]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setBZDVarargs(value: js.UndefOr[String]*): Self = this.set("BZD", js.Array(value :_*))
    @scala.inline
    def setBZD(value: js.Array[js.UndefOr[String]]): Self = this.set("BZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCADVarargs(value: js.UndefOr[String]*): Self = this.set("CAD", js.Array(value :_*))
    @scala.inline
    def setCAD(value: js.Array[js.UndefOr[String]]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCUCVarargs(value: js.UndefOr[String]*): Self = this.set("CUC", js.Array(value :_*))
    @scala.inline
    def setCUC(value: js.Array[js.UndefOr[String]]): Self = this.set("CUC", value.asInstanceOf[js.Any])
    @scala.inline
    def setCUPVarargs(value: js.UndefOr[String]*): Self = this.set("CUP", js.Array(value :_*))
    @scala.inline
    def setCUP(value: js.Array[js.UndefOr[String]]): Self = this.set("CUP", value.asInstanceOf[js.Any])
    @scala.inline
    def setDOPVarargs(value: js.UndefOr[String]*): Self = this.set("DOP", js.Array(value :_*))
    @scala.inline
    def setDOP(value: js.Array[js.UndefOr[String]]): Self = this.set("DOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setFJDVarargs(value: js.UndefOr[String]*): Self = this.set("FJD", js.Array(value :_*))
    @scala.inline
    def setFJD(value: js.Array[js.UndefOr[String]]): Self = this.set("FJD", value.asInstanceOf[js.Any])
    @scala.inline
    def setFKPVarargs(value: js.UndefOr[String]*): Self = this.set("FKP", js.Array(value :_*))
    @scala.inline
    def setFKP(value: js.Array[js.UndefOr[String]]): Self = this.set("FKP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGYDVarargs(value: js.UndefOr[String]*): Self = this.set("GYD", js.Array(value :_*))
    @scala.inline
    def setGYD(value: js.Array[js.UndefOr[String]]): Self = this.set("GYD", value.asInstanceOf[js.Any])
    @scala.inline
    def setISKVarargs(value: js.UndefOr[String]*): Self = this.set("ISK", js.Array(value :_*))
    @scala.inline
    def setISK(value: js.Array[js.UndefOr[String]]): Self = this.set("ISK", value.asInstanceOf[js.Any])
    @scala.inline
    def setJMDVarargs(value: js.UndefOr[String]*): Self = this.set("JMD", js.Array(value :_*))
    @scala.inline
    def setJMD(value: js.Array[js.UndefOr[String]]): Self = this.set("JMD", value.asInstanceOf[js.Any])
    @scala.inline
    def setKYDVarargs(value: js.UndefOr[String]*): Self = this.set("KYD", js.Array(value :_*))
    @scala.inline
    def setKYD(value: js.Array[js.UndefOr[String]]): Self = this.set("KYD", value.asInstanceOf[js.Any])
    @scala.inline
    def setLRDVarargs(value: js.UndefOr[String]*): Self = this.set("LRD", js.Array(value :_*))
    @scala.inline
    def setLRD(value: js.Array[js.UndefOr[String]]): Self = this.set("LRD", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: String*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[String]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNADVarargs(value: js.UndefOr[String]*): Self = this.set("NAD", js.Array(value :_*))
    @scala.inline
    def setNAD(value: js.Array[js.UndefOr[String]]): Self = this.set("NAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUBVarargs(value: String*): Self = this.set("RUB", js.Array(value :_*))
    @scala.inline
    def setRUB(value: js.Array[String]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setSBDVarargs(value: js.UndefOr[String]*): Self = this.set("SBD", js.Array(value :_*))
    @scala.inline
    def setSBD(value: js.Array[js.UndefOr[String]]): Self = this.set("SBD", value.asInstanceOf[js.Any])
    @scala.inline
    def setSGDVarargs(value: js.UndefOr[String]*): Self = this.set("SGD", js.Array(value :_*))
    @scala.inline
    def setSGD(value: js.Array[js.UndefOr[String]]): Self = this.set("SGD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTTDVarargs(value: js.UndefOr[String]*): Self = this.set("TTD", js.Array(value :_*))
    @scala.inline
    def setTTD(value: js.Array[js.UndefOr[String]]): Self = this.set("TTD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUYUVarargs(value: js.UndefOr[String]*): Self = this.set("UYU", js.Array(value :_*))
    @scala.inline
    def setUYU(value: js.Array[js.UndefOr[String]]): Self = this.set("UYU", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCDVarargs(value: String*): Self = this.set("XCD", js.Array(value :_*))
    @scala.inline
    def setXCD(value: js.Array[String]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
  
}

