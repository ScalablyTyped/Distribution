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
  var progress: js.UndefOr[js.Function1[/* repeated */js.Any, _]] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

