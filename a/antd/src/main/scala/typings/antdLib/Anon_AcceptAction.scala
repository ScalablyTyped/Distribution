package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcceptAction extends js.Object {
  var accept: java.lang.String
  var action: java.lang.String
  var beforeUpload: js.Function0[scala.Boolean]
  var className: java.lang.String
  var disabled: scala.Boolean
  var listType: antdLib.libUploadInterfaceMod.UploadListType
  var multiple: scala.Boolean
  var showUploadList: scala.Boolean
  var supportServerRender: scala.Boolean
  var `type`: antdLib.libUploadInterfaceMod.UploadType
}

object Anon_AcceptAction {
  @scala.inline
  def apply(
    accept: java.lang.String,
    action: java.lang.String,
    beforeUpload: () => scala.Boolean,
    className: java.lang.String,
    disabled: scala.Boolean,
    listType: antdLib.libUploadInterfaceMod.UploadListType,
    multiple: scala.Boolean,
    showUploadList: scala.Boolean,
    supportServerRender: scala.Boolean,
    `type`: antdLib.libUploadInterfaceMod.UploadType
  ): Anon_AcceptAction = {
    val __obj = js.Dynamic.literal(accept = accept, action = action, beforeUpload = js.Any.fromFunction0(beforeUpload), className = className, disabled = disabled, listType = listType, multiple = multiple, showUploadList = showUploadList, supportServerRender = supportServerRender)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_AcceptAction]
  }
}

