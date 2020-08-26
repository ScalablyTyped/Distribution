package typings.androiduix.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Alt extends js.Object {
  var noMeta: `186` = js.native
  var shift: `186` = js.native
}

object Alt {
  @scala.inline
  def apply(noMeta: `186`, shift: `186`): Alt = {
    val __obj = js.Dynamic.literal(noMeta = noMeta.asInstanceOf[js.Any], shift = shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Alt]
  }
  @scala.inline
  implicit class AltOps[Self <: Alt] (val x: Self) extends AnyVal {
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
    def setNoMeta(value: `186`): Self = this.set("noMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def setShift(value: `186`): Self = this.set("shift", value.asInstanceOf[js.Any])
  }
  
}

