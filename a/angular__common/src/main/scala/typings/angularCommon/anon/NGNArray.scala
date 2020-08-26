package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NGNArray extends js.Object {
  var NGN: js.Array[String] = js.native
}

object NGNArray {
  @scala.inline
  def apply(NGN: js.Array[String]): NGNArray = {
    val __obj = js.Dynamic.literal(NGN = NGN.asInstanceOf[js.Any])
    __obj.asInstanceOf[NGNArray]
  }
  @scala.inline
  implicit class NGNArrayOps[Self <: NGNArray] (val x: Self) extends AnyVal {
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
    def setNGNVarargs(value: String*): Self = this.set("NGN", js.Array(value :_*))
    @scala.inline
    def setNGN(value: js.Array[String]): Self = this.set("NGN", value.asInstanceOf[js.Any])
  }
  
}

