package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AFNArray extends js.Object {
  var AFN: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
}

object AFNArray {
  @scala.inline
  def apply(AFN: js.Array[String], JPY: js.Array[String]): AFNArray = {
    val __obj = js.Dynamic.literal(AFN = AFN.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[AFNArray]
  }
  @scala.inline
  implicit class AFNArrayOps[Self <: AFNArray] (val x: Self) extends AnyVal {
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
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
  }
  
}

