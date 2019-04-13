package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResRules extends js.Object {
  var res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse
  var rules: js.Array[aliDashOssLib.aliDashOssMod.LifecycleRule]
}

object Anon_ResRules {
  @scala.inline
  def apply(
    res: aliDashOssLib.aliDashOssMod.NormalSuccessResponse,
    rules: js.Array[aliDashOssLib.aliDashOssMod.LifecycleRule]
  ): Anon_ResRules = {
    val __obj = js.Dynamic.literal(res = res, rules = rules)
  
    __obj.asInstanceOf[Anon_ResRules]
  }
}

