package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDFJD extends js.Object {
  var AUD: js.Array[String] = js.native
  var FJD: js.Array[js.UndefOr[String]] = js.native
  var JPY: js.Array[String] = js.native
  var NZD: js.Array[String] = js.native
  var SBD: js.Array[js.UndefOr[String]] = js.native
  var TOP: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object AUDFJD {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    FJD: js.Array[js.UndefOr[String]],
    JPY: js.Array[String],
    NZD: js.Array[String],
    SBD: js.Array[js.UndefOr[String]],
    TOP: js.Array[String],
    USD: js.Array[String]
  ): AUDFJD = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], FJD = FJD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], SBD = SBD.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDFJD]
  }
  @scala.inline
  implicit class AUDFJDOps[Self <: AUDFJD] (val x: Self) extends AnyVal {
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
    def setFJDVarargs(value: js.UndefOr[String]*): Self = this.set("FJD", js.Array(value :_*))
    @scala.inline
    def setFJD(value: js.Array[js.UndefOr[String]]): Self = this.set("FJD", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: String*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[String]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setSBDVarargs(value: js.UndefOr[String]*): Self = this.set("SBD", js.Array(value :_*))
    @scala.inline
    def setSBD(value: js.Array[js.UndefOr[String]]): Self = this.set("SBD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTOPVarargs(value: String*): Self = this.set("TOP", js.Array(value :_*))
    @scala.inline
    def setTOP(value: js.Array[String]): Self = this.set("TOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

