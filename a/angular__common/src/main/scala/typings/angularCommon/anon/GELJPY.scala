package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GELJPY extends js.Object {
  var GEL: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
}

object GELJPY {
  @scala.inline
  def apply(GEL: js.Array[String], JPY: js.Array[String]): GELJPY = {
    val __obj = js.Dynamic.literal(GEL = GEL.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any])
    __obj.asInstanceOf[GELJPY]
  }
  @scala.inline
  implicit class GELJPYOps[Self <: GELJPY] (val x: Self) extends AnyVal {
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
    def setGELVarargs(value: String*): Self = this.set("GEL", js.Array(value :_*))
    @scala.inline
    def setGEL(value: js.Array[String]): Self = this.set("GEL", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
  }
  
}

