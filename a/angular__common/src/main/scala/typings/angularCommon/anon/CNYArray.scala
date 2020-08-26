package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CNYArray extends js.Object {
  var CNY: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
}

object CNYArray {
  @scala.inline
  def apply(CNY: js.Array[String], JPY: js.Array[String]): CNYArray = {
    val __obj = js.Dynamic.literal(CNY = CNY.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[CNYArray]
  }
  @scala.inline
  implicit class CNYArrayOps[Self <: CNYArray] (val x: Self) extends AnyVal {
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
    def setCNYVarargs(value: String*): Self = this.set("CNY", js.Array(value :_*))
    @scala.inline
    def setCNY(value: js.Array[String]): Self = this.set("CNY", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
  }
  
}

