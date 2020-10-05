package typings.antd.baseMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseState extends js.Object {
  var clientRendered: Boolean = js.native
  var copied: Boolean = js.native
  var edit: Boolean = js.native
  var ellipsisContent: ReactNode = js.native
  var ellipsisText: String = js.native
  var expanded: Boolean = js.native
  var isEllipsis: Boolean = js.native
}

object BaseState {
  @scala.inline
  def apply(
    clientRendered: Boolean,
    copied: Boolean,
    edit: Boolean,
    ellipsisText: String,
    expanded: Boolean,
    isEllipsis: Boolean
  ): BaseState = {
    val __obj = js.Dynamic.literal(clientRendered = clientRendered.asInstanceOf[js.Any], copied = copied.asInstanceOf[js.Any], edit = edit.asInstanceOf[js.Any], ellipsisText = ellipsisText.asInstanceOf[js.Any], expanded = expanded.asInstanceOf[js.Any], isEllipsis = isEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseState]
  }
  @scala.inline
  implicit class BaseStateOps[Self <: BaseState] (val x: Self) extends AnyVal {
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
    def setClientRendered(value: Boolean): Self = this.set("clientRendered", value.asInstanceOf[js.Any])
    @scala.inline
    def setCopied(value: Boolean): Self = this.set("copied", value.asInstanceOf[js.Any])
    @scala.inline
    def setEdit(value: Boolean): Self = this.set("edit", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsisText(value: String): Self = this.set("ellipsisText", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEllipsis(value: Boolean): Self = this.set("isEllipsis", value.asInstanceOf[js.Any])
    @scala.inline
    def setEllipsisContent(value: ReactNode): Self = this.set("ellipsisContent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEllipsisContent: Self = this.set("ellipsisContent", js.undefined)
  }
  
}

