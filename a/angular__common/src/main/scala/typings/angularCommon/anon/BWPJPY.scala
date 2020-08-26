package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BWPJPY extends js.Object {
  var BWP: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object BWPJPY {
  @scala.inline
  def apply(BWP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BWPJPY = {
    val __obj = js.Dynamic.literal(BWP = BWP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BWPJPY]
  }
  @scala.inline
  implicit class BWPJPYOps[Self <: BWPJPY] (val x: Self) extends AnyVal {
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
    def setBWPVarargs(value: String*): Self = this.set("BWP", js.Array(value :_*))
    @scala.inline
    def setBWP(value: js.Array[String]): Self = this.set("BWP", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
  }
  
}

