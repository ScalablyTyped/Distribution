package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableDragHandle extends js.Object {
  var enableDragHandle: Boolean = js.native
  var prefixCls: String = js.native
}

object EnableDragHandle {
  @scala.inline
  def apply(enableDragHandle: Boolean, prefixCls: String): EnableDragHandle = {
    val __obj = js.Dynamic.literal(enableDragHandle = enableDragHandle.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableDragHandle]
  }
  @scala.inline
  implicit class EnableDragHandleOps[Self <: EnableDragHandle] (val x: Self) extends AnyVal {
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
    def setEnableDragHandle(value: Boolean): Self = this.set("enableDragHandle", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
  }
  
}

