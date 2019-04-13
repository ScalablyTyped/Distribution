package typings
package aliDashOssLib.aliDashOssMod

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
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var parallel: js.UndefOr[scala.Double] = js.undefined
   // the number of parts to be uploaded in parallel
  var partSize: js.UndefOr[scala.Double] = js.undefined
   // the suggested size for each part
  var progress: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object MultipartUploadOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback = null,
    checkpoint: Checkpoint = null,
    copyheaders: js.Object = null,
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: java.lang.String = null,
    parallel: scala.Int | scala.Double = null,
    partSize: scala.Int | scala.Double = null,
    progress: /* repeated */ js.Any => _ = null,
    timeout: scala.Int | scala.Double = null
  ): MultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (checkpoint != null) __obj.updateDynamic("checkpoint")(checkpoint)
    if (copyheaders != null) __obj.updateDynamic("copyheaders")(copyheaders)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (parallel != null) __obj.updateDynamic("parallel")(parallel.asInstanceOf[js.Any])
    if (partSize != null) __obj.updateDynamic("partSize")(partSize.asInstanceOf[js.Any])
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction1(progress))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipartUploadOptions]
  }
}

