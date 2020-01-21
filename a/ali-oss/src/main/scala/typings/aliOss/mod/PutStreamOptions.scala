package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutStreamOptions extends js.Object {
  var callback: ObjectCallback
  var contentLength: js.UndefOr[Double] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: UserMeta
   // the operation timeout
  var mime: String
   // the stream length, chunked encoding will be used if absent
  var timeout: Double
}

object PutStreamOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback,
    meta: UserMeta,
    mime: String,
    timeout: Double,
    contentLength: Int | Double = null,
    headers: js.Object = null
  ): PutStreamOptions = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutStreamOptions]
  }
}

