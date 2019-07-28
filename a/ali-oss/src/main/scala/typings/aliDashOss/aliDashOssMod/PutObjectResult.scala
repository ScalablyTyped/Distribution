package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectResult extends js.Object {
  var data: js.Object
  var name: String
  var res: NormalSuccessResponse
}

object PutObjectResult {
  @scala.inline
  def apply(data: js.Object, name: String, res: NormalSuccessResponse): PutObjectResult = {
    val __obj = js.Dynamic.literal(data = data, name = name, res = res)
  
    __obj.asInstanceOf[PutObjectResult]
  }
}

