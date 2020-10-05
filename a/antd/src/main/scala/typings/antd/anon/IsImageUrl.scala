package typings.antd.anon

import typings.antd.uploadInterfaceMod.UploadFile
import typings.antd.uploadInterfaceMod.UploadListType
import typings.std.Blob
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsImageUrl extends js.Object {
  var listType: UploadListType = js.native
  var previewFile: js.Function1[/* file */ File | Blob, js.Promise[String]] = js.native
  var progress: ShowInfo = js.native
  var showDownloadIcon: Boolean = js.native
  var showPreviewIcon: Boolean = js.native
  var showRemoveIcon: Boolean = js.native
  def isImageUrl(file: UploadFile[_]): Boolean = js.native
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
  @scala.inline
  implicit class IsImageUrlOps[Self <: IsImageUrl] (val x: Self) extends AnyVal {
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
    def setIsImageUrl(value: UploadFile[_] => Boolean): Self = this.set("isImageUrl", js.Any.fromFunction1(value))
    @scala.inline
    def setListType(value: UploadListType): Self = this.set("listType", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewFile(value: /* file */ File | Blob => js.Promise[String]): Self = this.set("previewFile", js.Any.fromFunction1(value))
    @scala.inline
    def setProgress(value: ShowInfo): Self = this.set("progress", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowDownloadIcon(value: Boolean): Self = this.set("showDownloadIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowPreviewIcon(value: Boolean): Self = this.set("showPreviewIcon", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowRemoveIcon(value: Boolean): Self = this.set("showRemoveIcon", value.asInstanceOf[js.Any])
  }
  
}

