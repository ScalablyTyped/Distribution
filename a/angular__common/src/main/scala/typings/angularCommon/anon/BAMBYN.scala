package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BAMBYN extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var BAM: js.Array[String] = js.native
  var BYN: js.Array[js.UndefOr[String]] = js.native
  var GEL: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var NZD: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
}

object BAMBYN {
  @scala.inline
  def apply(
    AUD: js.Array[js.UndefOr[String]],
    BAM: js.Array[String],
    BYN: js.Array[js.UndefOr[String]],
    GEL: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    NZD: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]]
  ): BAMBYN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], BAM = BAM.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], GEL = GEL.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any])
    __obj.asInstanceOf[BAMBYN]
  }
  @scala.inline
  implicit class BAMBYNOps[Self <: BAMBYN] (val x: Self) extends AnyVal {
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
    def setBAMVarargs(value: String*): Self = this.set("BAM", js.Array(value :_*))
    @scala.inline
    def setBAM(value: js.Array[String]): Self = this.set("BAM", value.asInstanceOf[js.Any])
    @scala.inline
    def setBYNVarargs(value: js.UndefOr[String]*): Self = this.set("BYN", js.Array(value :_*))
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setGELVarargs(value: js.UndefOr[String]*): Self = this.set("GEL", js.Array(value :_*))
    @scala.inline
    def setGEL(value: js.Array[js.UndefOr[String]]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRWVarargs(value: js.UndefOr[String]*): Self = this.set("KRW", js.Array(value :_*))
    @scala.inline
    def setKRW(value: js.Array[js.UndefOr[String]]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: js.UndefOr[String]*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[js.UndefOr[String]]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
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

