package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UZS extends js.Object {
  var JPY: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var UZS: js.Array[String] = js.native
}

object UZS {
  @scala.inline
  def apply(JPY: js.Array[String], THB: js.Array[String], USD: js.Array[String], UZS: js.Array[String]): UZS = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], UZS = UZS.asInstanceOf[js.Any])
    __obj.asInstanceOf[UZS]
  }
  @scala.inline
  implicit class UZSOps[Self <: UZS] (val x: Self) extends AnyVal {
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
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
    @scala.inline
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setUZSVarargs(value: String*): Self = this.set("UZS", js.Array(value :_*))
    @scala.inline
    def setUZS(value: js.Array[String]): Self = this.set("UZS", value.asInstanceOf[js.Any])
  }
  
}

