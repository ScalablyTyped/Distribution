package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AFN extends js.Object {
  var AFN: js.Array[String] = js.native
  var CAD: js.Array[String] = js.native
  var CNY: js.Array[String] = js.native
  var HKD: js.Array[String] = js.native
  var IRR: js.Array[String] = js.native
  var MXN: js.Array[String] = js.native
  var NZD: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var XCD: js.Array[String] = js.native
}

object AFN {
  @scala.inline
  def apply(
    AFN: js.Array[String],
    CAD: js.Array[String],
    CNY: js.Array[String],
    HKD: js.Array[String],
    IRR: js.Array[String],
    MXN: js.Array[String],
    NZD: js.Array[String],
    THB: js.Array[String],
    XCD: js.Array[String]
  ): AFN = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], CAD = CAD.asInstanceOf[js.Any], CNY = CNY.asInstanceOf[js.Any], HKD = HKD.asInstanceOf[js.Any], IRR = IRR.asInstanceOf[js.Any], MXN = MXN.asInstanceOf[js.Any], NZD = NZD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], XCD = XCD.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFN]
  }
  @scala.inline
  implicit class AFNOps[Self <: AFN] (val x: Self) extends AnyVal {
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
    def setAFNVarargs(value: String*): Self = this.set("AFN", js.Array(value :_*))
    @scala.inline
    def setAFN(value: js.Array[String]): Self = this.set("AFN", value.asInstanceOf[js.Any])
    @scala.inline
    def setCADVarargs(value: String*): Self = this.set("CAD", js.Array(value :_*))
    @scala.inline
    def setCAD(value: js.Array[String]): Self = this.set("CAD", value.asInstanceOf[js.Any])
    @scala.inline
    def setCNYVarargs(value: String*): Self = this.set("CNY", js.Array(value :_*))
    @scala.inline
    def setCNY(value: js.Array[String]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setHKDVarargs(value: String*): Self = this.set("HKD", js.Array(value :_*))
    @scala.inline
    def setHKD(value: js.Array[String]): Self = this.set("HKD", value.asInstanceOf[js.Any])
    @scala.inline
    def setIRRVarargs(value: String*): Self = this.set("IRR", js.Array(value :_*))
    @scala.inline
    def setIRR(value: js.Array[String]): Self = this.set("IRR", value.asInstanceOf[js.Any])
    @scala.inline
    def setMXNVarargs(value: String*): Self = this.set("MXN", js.Array(value :_*))
    @scala.inline
    def setMXN(value: js.Array[String]): Self = this.set("MXN", value.asInstanceOf[js.Any])
    @scala.inline
    def setNZDVarargs(value: String*): Self = this.set("NZD", js.Array(value :_*))
    @scala.inline
    def setNZD(value: js.Array[String]): Self = this.set("NZD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setXCDVarargs(value: String*): Self = this.set("XCD", js.Array(value :_*))
    @scala.inline
    def setXCD(value: js.Array[String]): Self = this.set("XCD", value.asInstanceOf[js.Any])
  }
  
}

