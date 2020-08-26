package typings.antd.uploadInterfaceMod

import typings.std.Blob
import typings.std.Date
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UploadFile[T] extends js.Object {
  var error: js.UndefOr[js.Any] = js.native
  var fileName: js.UndefOr[String] = js.native
  var lastModified: js.UndefOr[Double] = js.native
  var lastModifiedDate: js.UndefOr[Date] = js.native
  var linkProps: js.UndefOr[js.Any] = js.native
  var name: String = js.native
  var originFileObj: js.UndefOr[File | Blob] = js.native
  var percent: js.UndefOr[Double] = js.native
  var preview: js.UndefOr[String] = js.native
  var response: js.UndefOr[T] = js.native
  var size: Double = js.native
  var status: js.UndefOr[UploadFileStatus] = js.native
  var thumbUrl: js.UndefOr[String] = js.native
  var `type`: String = js.native
  var uid: String = js.native
  var url: js.UndefOr[String] = js.native
  var xhr: js.UndefOr[T] = js.native
}

object UploadFile {
  @scala.inline
  def apply[T](name: String, size: Double, `type`: String, uid: String): UploadFile[T] = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFile[T]]
  }
  @scala.inline
  implicit class UploadFileOps[Self <: UploadFile[_], T] (val x: Self with UploadFile[T]) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUid(value: String): Self = this.set("uid", value.asInstanceOf[js.Any])
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setLastModified(value: Double): Self = this.set("lastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModified: Self = this.set("lastModified", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: Date): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setLinkProps(value: js.Any): Self = this.set("linkProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinkProps: Self = this.set("linkProps", js.undefined)
    @scala.inline
    def setOriginFileObj(value: File | Blob): Self = this.set("originFileObj", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginFileObj: Self = this.set("originFileObj", js.undefined)
    @scala.inline
    def setPercent(value: Double): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePercent: Self = this.set("percent", js.undefined)
    @scala.inline
    def setPreview(value: String): Self = this.set("preview", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    @scala.inline
    def setResponse(value: T): Self = this.set("response", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponse: Self = this.set("response", js.undefined)
    @scala.inline
    def setStatus(value: UploadFileStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setThumbUrl(value: String): Self = this.set("thumbUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbUrl: Self = this.set("thumbUrl", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setXhr(value: T): Self = this.set("xhr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXhr: Self = this.set("xhr", js.undefined)
  }
  
}

