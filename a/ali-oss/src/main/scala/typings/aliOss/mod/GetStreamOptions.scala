package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamOptions extends js.Object {
   // image process params, will send with x-oss-process e.g.: {process: 'image/resize,w_200'}
  var headers: js.UndefOr[js.Object] = js.undefined
  var process: js.UndefOr[String] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object GetStreamOptions {
  @scala.inline
  def apply(headers: js.Object = null, process: String = null, timeout: js.UndefOr[Double] = js.undefined): GetStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (process != null) __obj.updateDynamic("process")(process.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamOptions]
  }
}

