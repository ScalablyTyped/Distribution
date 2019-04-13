package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamResult extends js.Object {
   // readable stream instance if response status is not 200, stream will be null.
  var res: NormalSuccessResponse
  var stream: js.UndefOr[js.Any] = js.undefined
}

object GetStreamResult {
  @scala.inline
  def apply(res: NormalSuccessResponse, stream: js.Any = null): GetStreamResult = {
    val __obj = js.Dynamic.literal(res = res)
    if (stream != null) __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[GetStreamResult]
  }
}

