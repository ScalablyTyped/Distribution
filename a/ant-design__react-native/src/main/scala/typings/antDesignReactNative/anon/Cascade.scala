package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cascade extends js.Object {
  var cascade: Boolean = js.native
  var cols: Double = js.native
  var value: js.Array[scala.Nothing] = js.native
  def onChange(): Unit = js.native
}

object Cascade {
  @scala.inline
  def apply(cascade: Boolean, cols: Double, onChange: () => Unit, value: js.Array[scala.Nothing]): Cascade = {
    val __obj = js.Dynamic.literal(cascade = cascade.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], onChange = js.Any.fromFunction0(onChange), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cascade]
  }
  @scala.inline
  implicit class CascadeOps[Self <: Cascade] (val x: Self) extends AnyVal {
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
    def setCascade(value: Boolean): Self = this.set("cascade", value.asInstanceOf[js.Any])
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def setValueVarargs(value: scala.Nothing*): Self = this.set("value", js.Array(value :_*))
    @scala.inline
    def setValue(value: js.Array[scala.Nothing]): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

