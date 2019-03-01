package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: js.Object
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Data {
  @scala.inline
  def apply(data: js.Object, res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse): Anon_Data = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Data]
  }
}

