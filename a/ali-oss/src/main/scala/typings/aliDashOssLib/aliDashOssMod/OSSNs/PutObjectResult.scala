package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutObjectResult extends js.Object {
  var data: js.Object
  var name: java.lang.String
  var res: NormalSuccessResponse
}

object PutObjectResult {
  @scala.inline
  def apply(data: js.Object, name: java.lang.String, res: NormalSuccessResponse): PutObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[PutObjectResult]
  }
}

