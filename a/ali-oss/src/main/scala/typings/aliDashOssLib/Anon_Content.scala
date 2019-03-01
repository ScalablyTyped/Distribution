package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.Any
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Content {
  @scala.inline
  def apply(content: js.Any, res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse): Anon_Content = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("content")(content)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Content]
  }
}

