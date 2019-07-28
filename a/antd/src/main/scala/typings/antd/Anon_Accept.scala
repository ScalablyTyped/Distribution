package typings.antd

import typings.antd.esUploadInterfaceMod.UploadListType
import typings.antd.esUploadInterfaceMod.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accept extends js.Object {
  var accept: String
  var action: String
  var beforeUpload: js.Function0[Boolean]
  var className: String
  var disabled: Boolean
  var listType: UploadListType
  var multiple: Boolean
  var showUploadList: Boolean
  var supportServerRender: Boolean
  var `type`: UploadType
}

object Anon_Accept {
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
  ): Anon_Accept = {
    val __obj = js.Dynamic.literal(accept = accept, action = action, beforeUpload = js.Any.fromFunction0(beforeUpload), className = className, disabled = disabled, listType = listType, multiple = multiple, showUploadList = showUploadList, supportServerRender = supportServerRender)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Accept]
  }
}

