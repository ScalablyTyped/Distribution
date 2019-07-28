package typings.aliDashOss.aliDashOssMod

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
    timeout: Int | Double = null
  ): InitMultipartUploadOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitMultipartUploadOptions]
  }
}

