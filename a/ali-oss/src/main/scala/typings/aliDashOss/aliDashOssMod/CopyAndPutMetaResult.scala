package typings.aliDashOss.aliDashOssMod

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
    val __obj = js.Dynamic.literal(data = data, res = res)
  
    __obj.asInstanceOf[CopyAndPutMetaResult]
  }
}

