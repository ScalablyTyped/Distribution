package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Name extends js.Object {
  var name: java.lang.String
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Name {
  @scala.inline
  def apply(name: java.lang.String, res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse): Anon_Name = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[Anon_Name]
  }
}

