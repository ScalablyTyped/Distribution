package typings.antd

import typings.antd.uploadInterfaceMod.UploadListType
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFile extends js.Object {
  var listType: UploadListType
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]]
  var progressAttr: AnonShowInfo
  var showDownloadIcon: Boolean
  var showPreviewIcon: Boolean
  var showRemoveIcon: Boolean
}

object AnonFile {
  @scala.inline
  def apply(
    listType: UploadListType,
    previewFile: /* file */ File | Blob => js.Promise[String],
    progressAttr: AnonShowInfo,
    showDownloadIcon: Boolean,
    showPreviewIcon: Boolean,
    showRemoveIcon: Boolean
  ): AnonFile = {
    val __obj = js.Dynamic.literal(listType = listType.asInstanceOf[js.Any], previewFile = js.Any.fromFunction1(previewFile), progressAttr = progressAttr.asInstanceOf[js.Any], showDownloadIcon = showDownloadIcon.asInstanceOf[js.Any], showPreviewIcon = showPreviewIcon.asInstanceOf[js.Any], showRemoveIcon = showRemoveIcon.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFile]
  }
}

