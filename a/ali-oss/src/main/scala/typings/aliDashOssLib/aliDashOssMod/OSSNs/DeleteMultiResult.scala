package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultiResult extends js.Object {
  var deleted: js.UndefOr[js.Array[java.lang.String]] = js.undefined
   // deleted object names list
  var res: NormalSuccessResponse
}

object DeleteMultiResult {
  @scala.inline
  def apply(res: NormalSuccessResponse, deleted: js.Array[java.lang.String] = null): DeleteMultiResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("res")(res)
    if (deleted != null) __obj.updateDynamic("deleted")(deleted)
    __obj.asInstanceOf[DeleteMultiResult]
  }
}

