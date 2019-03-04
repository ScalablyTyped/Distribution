package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectOptions extends js.Object {
   // user meta, will send with x-oss-meta- prefix string e.g.: { uid: 123, pid: 110 }
  var callback: ObjectCallback
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
   // the operation timeout
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object PutObjectOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback,
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): PutObjectOptions = {
    val __obj = js.Dynamic.literal(callback = callback)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOptions]
  }
}

