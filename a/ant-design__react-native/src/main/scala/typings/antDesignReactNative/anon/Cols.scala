package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cols extends js.Object {
  var cols: js.Array[Key] = js.native
  var selMinute: js.Any = js.native
}

object Cols {
  @scala.inline
  def apply(cols: js.Array[Key], selMinute: js.Any): Cols = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], selMinute = selMinute.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cols]
  }
  @scala.inline
  implicit class ColsOps[Self <: Cols] (val x: Self) extends AnyVal {
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
    def setColsVarargs(value: Key*): Self = this.set("cols", js.Array(value :_*))
    @scala.inline
    def setCols(value: js.Array[Key]): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelMinute(value: js.Any): Self = this.set("selMinute", value.asInstanceOf[js.Any])
  }
  
}

