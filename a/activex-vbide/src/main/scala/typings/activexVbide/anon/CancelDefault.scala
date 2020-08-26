package typings.activexVbide.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelDefault extends js.Object {
  val CancelDefault: Boolean = js.native
  val CommandBarControl: js.Any = js.native
  val handled: Boolean = js.native
}

object CancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, CommandBarControl: js.Any, handled: Boolean): CancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], CommandBarControl = CommandBarControl.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDefault]
  }
  @scala.inline
  implicit class CancelDefaultOps[Self <: CancelDefault] (val x: Self) extends AnyVal {
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
    def setCancelDefault(value: Boolean): Self = this.set("CancelDefault", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandBarControl(value: js.Any): Self = this.set("CommandBarControl", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
  }
  
}

