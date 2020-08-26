package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AUDMOP extends js.Object {
  var AUD: js.Array[String] = js.native
  var MOP: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var USD: js.Array[String] = js.native
  var XXX: js.Array[scala.Nothing] = js.native
}

object AUDMOP {
  @scala.inline
  def apply(
    AUD: js.Array[String],
    MOP: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    USD: js.Array[String],
    XXX: js.Array[scala.Nothing]
  ): AUDMOP = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], MOP = MOP.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUDMOP]
  }
  @scala.inline
  implicit class AUDMOPOps[Self <: AUDMOP] (val x: Self) extends AnyVal {
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
    def setMOPVarargs(value: String*): Self = this.set("MOP", js.Array(value :_*))
    @scala.inline
    def setMOP(value: js.Array[String]): Self = this.set("MOP", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setXXXVarargs(value: scala.Nothing*): Self = this.set("XXX", js.Array(value :_*))
    @scala.inline
    def setXXX(value: js.Array[scala.Nothing]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
  
}

