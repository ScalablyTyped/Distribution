package typings.antd.anon

import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListType
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsImageUrl extends js.Object {
  var listType: UploadListType
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]]
  var progress: ShowInfo
  var showDownloadIcon: Boolean
  var showPreviewIcon: Boolean
  var showRemoveIcon: Boolean
  def isImageUrl(file: UploadFile[_]): Boolean
}

object IsImageUrl {
  @scala.inline
  def apply(
    isImageUrl: UploadFile[_] => Boolean,
    listType: UploadListType,
    previewFile: /* file */ File | Blob => js.Promise[String],
    progress: ShowInfo,
    showDownloadIcon: Boolean,
    showPreviewIcon: Boolean,
    showRemoveIcon: Boolean
  ): IsImageUrl = {
    val __obj = js.Dynamic.literal(isImageUrl = js.Any.fromFunction1(isImageUrl), listType = listType.asInstanceOf[js.Any], previewFile = js.Any.fromFunction1(previewFile), progress = progress.asInstanceOf[js.Any], showDownloadIcon = showDownloadIcon.asInstanceOf[js.Any], showPreviewIcon = showPreviewIcon.asInstanceOf[js.Any], showRemoveIcon = showRemoveIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsImageUrl]
  }
}

