package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UAH extends js.Object {
  var GEL: js.Array[js.UndefOr[String]] = js.native
  var MDL: js.Array[String] = js.native
  var RON: js.Array[js.UndefOr[String]] = js.native
  var RUB: js.Array[String] = js.native
  var RUR: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TMT: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var UAH: js.Array[String] = js.native
  var XXX: js.Array[String] = js.native
}

object UAH {
  @scala.inline
  def apply(
    GEL: js.Array[js.UndefOr[String]],
    MDL: js.Array[String],
    RON: js.Array[js.UndefOr[String]],
    RUB: js.Array[String],
    RUR: js.Array[String],
    THB: js.Array[String],
    TMT: js.Array[String],
    TWD: js.Array[String],
    UAH: js.Array[String],
    XXX: js.Array[String]
  ): UAH = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], MDL = MDL.asInstanceOf[js.Any], RON = RON.asInstanceOf[js.Any], RUB = RUB.asInstanceOf[js.Any], RUR = RUR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TMT = TMT.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], UAH = UAH.asInstanceOf[js.Any], XXX = XXX.asInstanceOf[js.Any])
    __obj.asInstanceOf[UAH]
  }
  @scala.inline
  implicit class UAHOps[Self <: UAH] (val x: Self) extends AnyVal {
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
    def setGELVarargs(value: js.UndefOr[String]*): Self = this.set("GEL", js.Array(value :_*))
    @scala.inline
    def setGEL(value: js.Array[js.UndefOr[String]]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMDLVarargs(value: String*): Self = this.set("MDL", js.Array(value :_*))
    @scala.inline
    def setMDL(value: js.Array[String]): Self = this.set("MDL", value.asInstanceOf[js.Any])
    @scala.inline
    def setRONVarargs(value: js.UndefOr[String]*): Self = this.set("RON", js.Array(value :_*))
    @scala.inline
    def setRON(value: js.Array[js.UndefOr[String]]): Self = this.set("RON", value.asInstanceOf[js.Any])
    @scala.inline
    def setRUBVarargs(value: String*): Self = this.set("RUB", js.Array(value :_*))
    @scala.inline
    def setRUB(value: js.Array[String]): Self = this.set("RUB", value.asInstanceOf[js.Any])
    @scala.inline
    def setRURVarargs(value: String*): Self = this.set("RUR", js.Array(value :_*))
    @scala.inline
    def setRUR(value: js.Array[String]): Self = this.set("RUR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTMTVarargs(value: String*): Self = this.set("TMT", js.Array(value :_*))
    @scala.inline
    def setTMT(value: js.Array[String]): Self = this.set("TMT", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUAHVarargs(value: String*): Self = this.set("UAH", js.Array(value :_*))
    @scala.inline
    def setUAH(value: js.Array[String]): Self = this.set("UAH", value.asInstanceOf[js.Any])
    @scala.inline
    def setXXXVarargs(value: String*): Self = this.set("XXX", js.Array(value :_*))
    @scala.inline
    def setXXX(value: js.Array[String]): Self = this.set("XXX", value.asInstanceOf[js.Any])
  }
  
}

