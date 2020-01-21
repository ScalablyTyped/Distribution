package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMultiResult extends js.Object {
  var deleted: js.UndefOr[js.Array[String]] = js.undefined
   // deleted object names list
  var res: NormalSuccessResponse
}

object DeleteMultiResult {
  @scala.inline
  def apply(res: NormalSuccessResponse, deleted: js.Array[String] = null): DeleteMultiResult = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    if (deleted != null) __obj.updateDynamic("deleted")(deleted.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiResult]
  }
}

