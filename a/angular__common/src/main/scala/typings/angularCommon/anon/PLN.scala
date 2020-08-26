package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PLN extends js.Object {
  var AUD: js.Array[js.UndefOr[String]] = js.native
  var PLN: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
}

object PLN {
  @scala.inline
  def apply(AUD: js.Array[js.UndefOr[String]], PLN: js.Array[String], THB: js.Array[String]): PLN = {
    val __obj = js.Dynamic.literal(AUD = AUD.asInstanceOf[js.Any], PLN = PLN.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[PLN]
  }
  @scala.inline
  implicit class PLNOps[Self <: PLN] (val x: Self) extends AnyVal {
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
    def setPLNVarargs(value: String*): Self = this.set("PLN", js.Array(value :_*))
    @scala.inline
    def setPLN(value: js.Array[String]): Self = this.set("PLN", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
  }
  
}

