package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GRD extends js.Object {
  var GRD: js.Array[String] = js.native
  var JPY: js.Array[String] = js.native
  var THB: js.Array[String] = js.native
}

object GRD {
  @scala.inline
  def apply(GRD: js.Array[String], JPY: js.Array[String], THB: js.Array[String]): GRD = {
    val __obj = js.Dynamic.literal(GRD = GRD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], THB = THB.asInstanceOf[js.Any])
    __obj.asInstanceOf[GRD]
  }
  @scala.inline
  implicit class GRDOps[Self <: GRD] (val x: Self) extends AnyVal {
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
    def setGRDVarargs(value: String*): Self = this.set("GRD", js.Array(value :_*))
    @scala.inline
    def setGRD(value: js.Array[String]): Self = this.set("GRD", value.asInstanceOf[js.Any])
    @scala.inline
    def setJPYVarargs(value: String*): Self = this.set("JPY", js.Array(value :_*))
    @scala.inline
    def setJPY(value: js.Array[String]): Self = this.set("JPY", value.asInstanceOf[js.Any])
    @scala.inline
    def setTHBVarargs(value: String*): Self = this.set("THB", js.Array(value :_*))
    @scala.inline
    def setTHB(value: js.Array[String]): Self = this.set("THB", value.asInstanceOf[js.Any])
  }
  
}

