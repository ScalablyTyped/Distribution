package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MKD extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var CNY: js.Array[js.UndefOr[String]] = js.native
  var GBP: js.Array[js.UndefOr[String]] = js.native
  var HKD: js.Array[js.UndefOr[String]] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var MKD: js.Array[String] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
}

object MKD {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    CNY: js.Array[js.UndefOr[String]],
    GBP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MKD: js.Array[String],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): MKD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], GBP = GBP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MKD = MKD.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[MKD]
  }
  @scala.inline
  implicit class MKDOps[Self <: MKD] (val x: Self) extends AnyVal {
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
    def setCNYVarargs(value: js.UndefOr[String]*): Self = this.set("CNY", js.Array(value :_*))
    @scala.inline
    def setCNY(value: js.Array[js.UndefOr[String]]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setGBPVarargs(value: js.UndefOr[String]*): Self = this.set("GBP", js.Array(value :_*))
    @scala.inline
    def setGBP(value: js.Array[js.UndefOr[String]]): Self = this.set("GBP", value.asInstanceOf[js.Any])
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
    def setMKDVarargs(value: String*): Self = this.set("MKD", js.Array(value :_*))
    @scala.inline
    def setMKD(value: js.Array[String]): Self = this.set("MKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
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
  }
  
}

