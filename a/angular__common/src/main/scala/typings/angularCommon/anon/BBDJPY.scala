package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BBDJPY extends js.Object {
  var BBD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
}

object BBDJPY {
  @scala.inline
  def apply(BBD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): BBDJPY = {
    val __obj = js.Dynamic.literal(BBD = BBD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
    __obj.asInstanceOf[BBDJPY]
  }
  @scala.inline
  implicit class BBDJPYOps[Self <: BBDJPY] (val x: Self) extends AnyVal {
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
    def setBBDVarargs(value: String*): Self = this.set("BBD", js.Array(value :_*))
    @scala.inline
    def setBBD(value: js.Array[String]): Self = this.set("BBD", value.asInstanceOf[js.Any])
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

