package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectOptions extends js.Object {
   // image process params, will send with x-oss-process e.g.: {process: 'image/resize,w_200'}
  var headers: js.UndefOr[js.Object] = js.undefined
  var process: js.UndefOr[java.lang.String] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object GetObjectOptions {
  @scala.inline
  def apply(
    headers: js.Object = null,
    process: java.lang.String = null,
    timeout: scala.Int | scala.Double = null
  ): GetObjectOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (process != null) __obj.updateDynamic("process")(process)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetObjectOptions]
  }
}

