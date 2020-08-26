package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipartUploadOptions extends js.Object {
  var callback: js.UndefOr[ObjectCallback] = js.native
   // the progress callback called after each successful upload of one part
  var checkpoint: js.UndefOr[Checkpoint] = js.native
  var copyheaders: js.UndefOr[js.Object] = js.native
  var headers: js.UndefOr[js.Object] = js.native
   // the checkpoint to resume upload, if this is provided, it will continue the upload from where interrupted, otherwise a new multipart upload will be created.
  var meta: js.UndefOr[UserMeta] = js.native
  var mime: js.UndefOr[String] = js.native
  var parallel: js.UndefOr[Double] = js.native
   // the number of parts to be uploaded in parallel
  var partSize: js.UndefOr[Double] = js.native
   // the suggested size for each part
  var progress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object MultipartUploadOptions {
  @scala.inline
  def apply(): MultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MultipartUploadOptions]
  }
  @scala.inline
  implicit class MultipartUploadOptionsOps[Self <: MultipartUploadOptions] (val x: Self) extends AnyVal {
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
    def setCallback(value: ObjectCallback): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setCheckpoint(value: Checkpoint): Self = this.set("checkpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckpoint: Self = this.set("checkpoint", js.undefined)
    @scala.inline
    def setCopyheaders(value: js.Object): Self = this.set("copyheaders", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyheaders: Self = this.set("copyheaders", js.undefined)
    @scala.inline
    def setHeaders(value: js.Object): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setMeta(value: UserMeta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    @scala.inline
    def setMime(value: String): Self = this.set("mime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMime: Self = this.set("mime", js.undefined)
    @scala.inline
    def setParallel(value: Double): Self = this.set("parallel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParallel: Self = this.set("parallel", js.undefined)
    @scala.inline
    def setPartSize(value: Double): Self = this.set("partSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePartSize: Self = this.set("partSize", js.undefined)
    @scala.inline
    def setProgress(value: /* repeated */ js.Any => _): Self = this.set("progress", js.Any.fromFunction1(value))
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

