package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutStreamOptions extends js.Object {
  var callback: ObjectCallback
  var contentLength: js.UndefOr[scala.Double] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: UserMeta
   // the operation timeout
  var mime: java.lang.String
   // the stream length, chunked encoding will be used if absent
  var timeout: scala.Double
}

object PutStreamOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback,
    meta: UserMeta,
    mime: java.lang.String,
    timeout: scala.Double,
    contentLength: scala.Int | scala.Double = null,
    headers: js.Object = null
  ): PutStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callback")(callback)
    __obj.updateDynamic("meta")(meta)
    __obj.updateDynamic("mime")(mime)
    __obj.updateDynamic("timeout")(timeout)
    if (contentLength != null) __obj.updateDynamic("contentLength")(contentLength.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[PutStreamOptions]
  }
}

