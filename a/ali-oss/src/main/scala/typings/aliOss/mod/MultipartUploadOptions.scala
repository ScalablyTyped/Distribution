package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipartUploadOptions extends js.Object {
  var callback: js.UndefOr[ObjectCallback] = js.undefined
   // the progress callback called after each successful upload of one part
  var checkpoint: js.UndefOr[Checkpoint] = js.undefined
  var copyheaders: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
   // the checkpoint to resume upload, if this is provided, it will continue the upload from where interrupted, otherwise a new multipart upload will be created.
  var meta: js.UndefOr[UserMeta] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var parallel: js.UndefOr[Double] = js.undefined
   // the number of parts to be uploaded in parallel
  var partSize: js.UndefOr[Double] = js.undefined
   // the suggested size for each part
  var progress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object MultipartUploadOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback = null,
    checkpoint: Checkpoint = null,
    copyheaders: js.Object = null,
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: String = null,
    parallel: js.UndefOr[Double] = js.undefined,
    partSize: js.UndefOr[Double] = js.undefined,
    progress: /* repeated */ js.Any => _ = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): MultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (checkpoint != null) __obj.updateDynamic("checkpoint")(checkpoint.asInstanceOf[js.Any])
    if (copyheaders != null) __obj.updateDynamic("copyheaders")(copyheaders.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (!js.isUndefined(parallel)) __obj.updateDynamic("parallel")(parallel.get.asInstanceOf[js.Any])
    if (!js.isUndefined(partSize)) __obj.updateDynamic("partSize")(partSize.get.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadOptions]
  }
}

