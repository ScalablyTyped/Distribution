package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitMultipartUploadOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
   // Mime file type
  var meta: js.UndefOr[UserMeta] = js.undefined
  var mime: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object InitMultipartUploadOptions {
  @scala.inline
  def apply(
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: String = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): InitMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitMultipartUploadOptions]
  }
}

