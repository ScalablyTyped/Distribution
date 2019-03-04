package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResRules extends js.Object {
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  var rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.LifecycleRule]
}

object Anon_ResRules {
  @scala.inline
  def apply(
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse,
    rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.LifecycleRule]
  ): Anon_ResRules = {
    val __obj = js.Dynamic.literal(res = res, rules = rules)
  
    __obj.asInstanceOf[Anon_ResRules]
  }
}

