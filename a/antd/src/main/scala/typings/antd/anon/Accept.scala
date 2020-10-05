package typings.antd.anon

import typings.antd.uploadInterfaceMod.UploadListType
import typings.antd.uploadInterfaceMod.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accept extends js.Object {
  var accept: String = js.native
  var action: String = js.native
  var beforeUpload: js.Function0[Boolean] = js.native
  var className: String = js.native
  var disabled: Boolean = js.native
  var listType: UploadListType = js.native
  var multiple: Boolean = js.native
  var showUploadList: Boolean = js.native
  var supportServerRender: Boolean = js.native
  var `type`: UploadType = js.native
}

object Accept {
  @scala.inline
  def apply(
    accept: String,
    action: String,
    beforeUpload: () => Boolean,
    className: String,
    disabled: Boolean,
    listType: UploadListType,
    multiple: Boolean,
    showUploadList: Boolean,
    supportServerRender: Boolean,
    `type`: UploadType
  ): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], beforeUpload = js.Any.fromFunction0(beforeUpload), className = className.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], listType = listType.asInstanceOf[js.Any], multiple = multiple.asInstanceOf[js.Any], showUploadList = showUploadList.asInstanceOf[js.Any], supportServerRender = supportServerRender.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
  @scala.inline
  implicit class AcceptOps[Self <: Accept] (val x: Self) extends AnyVal {
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
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    @scala.inline
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    @scala.inline
    def setBeforeUpload(value: () => Boolean): Self = this.set("beforeUpload", js.Any.fromFunction0(value))
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setListType(value: UploadListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowUploadList(value: Boolean): Self = this.set("showUploadList", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportServerRender(value: Boolean): Self = this.set("supportServerRender", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: UploadType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

