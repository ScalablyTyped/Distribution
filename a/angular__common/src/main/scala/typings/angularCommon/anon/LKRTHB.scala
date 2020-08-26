package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LKRTHB extends js.Object {
  var LKR: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var TWD: js.Array[String] = js.native
}

object LKRTHB {
  @scala.inline
  def apply(LKR: js.Array[String], THB: js.Array[String], TWD: js.Array[String]): LKRTHB = {
    val __obj = js.Dynamic.literal(LKR = LKR.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], TWD = TWD.asInstanceOf[js.Any])
    __obj.asInstanceOf[LKRTHB]
  }
  @scala.inline
  implicit class LKRTHBOps[Self <: LKRTHB] (val x: Self) extends AnyVal {
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
    def setLKRVarargs(value: String*): Self = this.set("LKR", js.Array(value :_*))
    @scala.inline
    def setLKR(value: js.Array[String]): Self = this.set("LKR", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setTWDVarargs(value: String*): Self = this.set("TWD", js.Array(value :_*))
    @scala.inline
    def setTWD(value: js.Array[String]): Self = this.set("TWD", value.asInstanceOf[js.Any])
  }
  
}

