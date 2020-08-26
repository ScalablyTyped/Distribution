package typings.angularCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VUV extends js.Object {
  var JPY: js.Array[String] = js.native
  var USD: js.Array[String] = js.native
  var VUV: js.Array[String] = js.native
}

object VUV {
  @scala.inline
  def apply(JPY: js.Array[String], USD: js.Array[String], VUV: js.Array[String]): VUV = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any], VUV = VUV.asInstanceOf[js.Any])
    __obj.asInstanceOf[VUV]
  }
  @scala.inline
  implicit class VUVOps[Self <: VUV] (val x: Self) extends AnyVal {
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
    def setUSDVarargs(value: String*): Self = this.set("USD", js.Array(value :_*))
    @scala.inline
    def setUSD(value: js.Array[String]): Self = this.set("USD", value.asInstanceOf[js.Any])
    @scala.inline
    def setVUVVarargs(value: String*): Self = this.set("VUV", js.Array(value :_*))
    @scala.inline
    def setVUV(value: js.Array[String]): Self = this.set("VUV", value.asInstanceOf[js.Any])
  }
  
}

