package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BTN extends js.Object {
  var AUD: js.Array[String] = js.native
  var BTN: js.Array[String] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var KRW: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var XAF: js.Array[scala.Nothing] = js.native
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
  implicit class BTNOps[Self <: BTN] (val x: Self) extends AnyVal {
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
    def setBTNVarargs(value: String*): Self = this.set("BTN", js.Array(value :_*))
    @scala.inline
    def setBTN(value: js.Array[String]): Self = this.set("BTN", value.asInstanceOf[js.Any])
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = this.set("ILS", js.Array(value :_*))
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setKRWVarargs(value: String*): Self = this.set("KRW", js.Array(value :_*))
    @scala.inline
    def setKRW(value: js.Array[String]): Self = this.set("KRW", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXAFVarargs(value: scala.Nothing*): Self = this.set("XAF", js.Array(value :_*))
    @scala.inline
    def setXAF(value: js.Array[scala.Nothing]): Self = this.set("XAF", value.asInstanceOf[js.Any])
  }
  
}

