package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetObjectResult extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
   // file content buffer if file parameter is null or ignore
  var res: NormalSuccessResponse
}

object GetObjectResult {
  @scala.inline
  def apply(res: NormalSuccessResponse, content: js.Any = null): GetObjectResult = {
    val __obj = js.Dynamic.literal(res = res)
    if (content != null) __obj.updateDynamic("content")(content)
    __obj.asInstanceOf[GetObjectResult]
  }
}

