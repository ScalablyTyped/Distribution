package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyAndPutMetaResult extends js.Object {
  var data: ModifyData
  var res: NormalSuccessResponse
}

object CopyAndPutMetaResult {
  @scala.inline
  def apply(data: ModifyData, res: NormalSuccessResponse): CopyAndPutMetaResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CopyAndPutMetaResult]
  }
}

