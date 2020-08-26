package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GIP extends js.Object {
  var GBP: js.Array[String] = js.native
  var GIP: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object GIP {
  @scala.inline
  def apply(GBP: js.Array[String], GIP: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): GIP = {
    val __obj = js.Dynamic.literal(GBP = GBP.asInstanceOf[js.Any], GIP = GIP.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[GIP]
  }
  @scala.inline
  implicit class GIPOps[Self <: GIP] (val x: Self) extends AnyVal {
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
    def setGBPVarargs(value: String*): Self = this.set("GBP", js.Array(value :_*))
    @scala.inline
    def setGBP(value: js.Array[String]): Self = this.set("GBP", value.asInstanceOf[js.Any])
    @scala.inline
    def setGIPVarargs(value: String*): Self = this.set("GIP", js.Array(value :_*))
    @scala.inline
    def setGIP(value: js.Array[String]): Self = this.set("GIP", value.asInstanceOf[js.Any])
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

