package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppendObjectOptions extends js.Object {
  var headers: js.UndefOr[js.Object] = js.undefined
   // custom mime, will send with Content-Type entity header
  var meta: js.UndefOr[UserMeta] = js.undefined
   // the operation timeout
  var mime: js.UndefOr[java.lang.String] = js.undefined
  var position: js.UndefOr[java.lang.String] = js.undefined
   // specify the position which is the content length of the latest object
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object AppendObjectOptions {
  @scala.inline
  def apply(
    headers: js.Object = null,
    meta: UserMeta = null,
    mime: java.lang.String = null,
    position: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): AppendObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (meta != null) __obj.updateDynamic("meta")(meta)
    if (mime != null) __obj.updateDynamic("mime")(mime)
    if (position != null) __obj.updateDynamic("position")(position)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendObjectOptions]
  }
}

