package typings.antd.siderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SiderState extends js.Object {
  var below: Boolean = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
}

object SiderState {
  @scala.inline
  def apply(below: Boolean): SiderState = {
    val __obj = js.Dynamic.literal(below = below.asInstanceOf[js.Any])
    __obj.asInstanceOf[SiderState]
  }
  @scala.inline
  implicit class SiderStateOps[Self <: SiderState] (val x: Self) extends AnyVal {
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
    def setBelow(value: Boolean): Self = this.set("below", value.asInstanceOf[js.Any])
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
  }
  
}

