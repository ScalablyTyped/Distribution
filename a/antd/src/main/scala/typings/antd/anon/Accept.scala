package typings.antd.anon

import typings.antd.uploadInterfaceMod.UploadListType
import typings.antd.uploadInterfaceMod.UploadType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
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
}

