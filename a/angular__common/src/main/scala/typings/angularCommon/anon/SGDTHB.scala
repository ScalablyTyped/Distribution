package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SGDTHB extends js.Object {
  var MYR: js.Array[String] = js.native
  var SGD: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object SGDTHB {
  @scala.inline
  def apply(
    MYR: js.Array[String],
    SGD: js.Array[String],
    THB: js.Array[String],
    TWD: js.Array[String],
    USD: js.Array[String]
  ): SGDTHB = {
    val __obj = js.Dynamic.literal(MYR = MYR.asInstanceOf[js.Any], SGD = SGD.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[SGDTHB]
  }
  @scala.inline
  implicit class SGDTHBOps[Self <: SGDTHB] (val x: Self) extends AnyVal {
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
    def setMYRVarargs(value: String*): Self = this.set("MYR", js.Array(value :_*))
    @scala.inline
    def setMYR(value: js.Array[String]): Self = this.set("MYR", value.asInstanceOf[js.Any])
    @scala.inline
    def setSGDVarargs(value: String*): Self = this.set("SGD", js.Array(value :_*))
    @scala.inline
    def setSGD(value: js.Array[String]): Self = this.set("SGD", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

