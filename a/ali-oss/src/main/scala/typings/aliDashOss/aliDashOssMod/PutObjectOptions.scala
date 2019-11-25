package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectOptions extends js.Object {
   // user meta, will send with x-oss-meta- prefix string e.g.: { uid: 123, pid: 110 }
  var callback: js.UndefOr[ObjectCallback] = js.undefined
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
   // the operation timeout
  var mime: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object PutObjectOptions {
  @scala.inline
  def apply(
    callback: ObjectCallback = null,
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: String = null,
    timeout: Int | Double = null
  ): PutObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (mime != null) __obj.updateDynamic("mime")(mime.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectOptions]
  }
}

