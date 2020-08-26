package typings.ariaQuery.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMDefinition extends js.Object {
  var interactive: js.UndefOr[Boolean] = js.native
  var reserved: js.UndefOr[Boolean] = js.native
}

object DOMDefinition {
  @scala.inline
  def apply(): DOMDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DOMDefinition]
  }
  @scala.inline
  implicit class DOMDefinitionOps[Self <: DOMDefinition] (val x: Self) extends AnyVal {
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
    def setInteractive(value: Boolean): Self = this.set("interactive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractive: Self = this.set("interactive", js.undefined)
    @scala.inline
    def setReserved(value: Boolean): Self = this.set("reserved", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReserved: Self = this.set("reserved", js.undefined)
  }
  
}

