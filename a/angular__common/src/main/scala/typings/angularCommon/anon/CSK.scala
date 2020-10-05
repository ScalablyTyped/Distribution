package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSK extends js.Object {
  var AUD: js.Array[String] = js.native
  var CSK: js.Array[String] = js.native
  var CZK: js.Array[String] = js.native
  var ILS: js.Array[js.UndefOr[String]] = js.native
  var INR: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var VND: js.Array[js.UndefOr[String]] = js.native
  var XEU: js.Array[String] = js.native
  var XXX: js.Array[scala.Nothing] = js.native
}

object CSK {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    CSK: js.Array[String],
    CZK: js.Array[String],
    ILS: js.Array[js.UndefOr[String]],
    INR: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    TWD: js.Array[String],
    USD: js.Array[String],
    VND: js.Array[js.UndefOr[String]],
    XEU: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): CSK = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], CSK = CSK.asInstanceOf[js.Any], CZK = CZK.asInstanceOf[js.Any], ILS = ILS.asInstanceOf[js.Any], INR = INR.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VND = VND.asInstanceOf[js.Any], XEU = XEU.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[CSK]
  }
  @scala.inline
  implicit class CSKOps[Self <: CSK] (val x: Self) extends AnyVal {
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
    def setCSKVarargs(value: String*): Self = this.set("CSK", js.Array(value :_*))
    @scala.inline
    def setCSK(value: js.Array[String]): Self = this.set("CSK", value.asInstanceOf[js.Any])
    @scala.inline
    def setCZKVarargs(value: String*): Self = this.set("CZK", js.Array(value :_*))
    @scala.inline
    def setCZK(value: js.Array[String]): Self = this.set("CZK", value.asInstanceOf[js.Any])
    @scala.inline
    def setILSVarargs(value: js.UndefOr[String]*): Self = this.set("ILS", js.Array(value :_*))
    @scala.inline
    def setILS(value: js.Array[js.UndefOr[String]]): Self = this.set("ILS", value.asInstanceOf[js.Any])
    @scala.inline
    def setINRVarargs(value: js.UndefOr[String]*): Self = this.set("INR", js.Array(value :_*))
    @scala.inline
    def setINR(value: js.Array[js.UndefOr[String]]): Self = this.set("INR", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
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
    @scala.inline
    def setXEUVarargs(value: String*): Self = this.set("XEU", js.Array(value :_*))
    @scala.inline
    def setXEU(value: js.Array[String]): Self = this.set("XEU", value.asInstanceOf[js.Any])
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
  
}

