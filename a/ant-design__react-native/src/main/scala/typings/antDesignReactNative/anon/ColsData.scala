package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ColsData extends js.Object {
  var cols: Double = js.native
  var data: js.Array[scala.Nothing] = js.native
  var disabled: Boolean = js.native
}

object ColsData {
  @scala.inline
  def apply(cols: Double, data: js.Array[scala.Nothing], disabled: Boolean): ColsData = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColsData]
  }
  @scala.inline
  implicit class ColsDataOps[Self <: ColsData] (val x: Self) extends AnyVal {
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
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataVarargs(value: scala.Nothing*): Self = this.set("data", js.Array(value :_*))
    @scala.inline
    def setData(value: js.Array[scala.Nothing]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
  }
  
}

