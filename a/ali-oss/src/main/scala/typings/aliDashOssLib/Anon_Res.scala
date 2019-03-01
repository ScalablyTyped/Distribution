package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Res extends js.Object {
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  var stream: js.Any
}

object Anon_Res {
  @scala.inline
  def apply(res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse, stream: js.Any): Anon_Res = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("res")(res)
    __obj.updateDynamic("stream")(stream)
    __obj.asInstanceOf[Anon_Res]
  }
}

