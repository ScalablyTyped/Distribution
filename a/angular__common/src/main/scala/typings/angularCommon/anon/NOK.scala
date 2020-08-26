package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NOK extends js.Object {
  var BRL: js.Array[js.UndefOr[String]] = js.native
  var BYN: js.Array[js.UndefOr[String]] = js.native
  var EGP: js.Array[js.UndefOr[String]] = js.native
  var HKD: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[js.UndefOr[String]] = js.native
  var KRW: js.Array[js.UndefOr[String]] = js.native
  var MXN: js.Array[js.UndefOr[String]] = js.native
  var NOK: js.Array[js.UndefOr[String]] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[js.UndefOr[String]] = js.native
}

object NOK {
  @scala.inline
  def apply(
    BRL: js.Array[js.UndefOr[String]],
    BYN: js.Array[js.UndefOr[String]],
    EGP: js.Array[js.UndefOr[String]],
    HKD: js.Array[js.UndefOr[String]],
    JPY: js.Array[js.UndefOr[String]],
    KRW: js.Array[js.UndefOr[String]],
    MXN: js.Array[js.UndefOr[String]],
    NOK: js.Array[js.UndefOr[String]],
    THB: js.Array[String],
    TWD: js.Array[js.UndefOr[String]],
    USD: js.Array[js.UndefOr[String]]
  ): NOK = {
    val __obj = js.Dynamic.literal(BRL = BRL.asInstanceOf[js.Any], BYN = BYN.asInstanceOf[js.Any], EGP = EGP.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], KRW = KRW.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NOK = NOK.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOK]
  }
  @scala.inline
  implicit class NOKOps[Self <: NOK] (val x: Self) extends AnyVal {
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
    def setBRLVarargs(value: js.UndefOr[String]*): Self = this.set("BRL", js.Array(value :_*))
    @scala.inline
    def setBRL(value: js.Array[js.UndefOr[String]]): Self = this.set("BRL", value.asInstanceOf[js.Any])
    @scala.inline
    def setBYNVarargs(value: js.UndefOr[String]*): Self = this.set("BYN", js.Array(value :_*))
    @scala.inline
    def setBYN(value: js.Array[js.UndefOr[String]]): Self = this.set("BYN", value.asInstanceOf[js.Any])
    @scala.inline
    def setEGPVarargs(value: js.UndefOr[String]*): Self = this.set("EGP", js.Array(value :_*))
    @scala.inline
    def setEGP(value: js.Array[js.UndefOr[String]]): Self = this.set("EGP", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKDVarargs(value: js.UndefOr[String]*): Self = this.set("HKD", js.Array(value :_*))
    @scala.inline
    def setHKD(value: js.Array[js.UndefOr[String]]): Self = this.set("HKD", value.asInstanceOf[js.Any])
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
    def setNOKVarargs(value: js.UndefOr[String]*): Self = this.set("NOK", js.Array(value :_*))
    @scala.inline
    def setNOK(value: js.Array[js.UndefOr[String]]): Self = this.set("NOK", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: js.UndefOr[String]*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[js.UndefOr[String]]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: js.UndefOr[String]*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[js.UndefOr[String]]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

