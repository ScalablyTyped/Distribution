package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.LifecycleRule
import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResRules extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[LifecycleRule]
}

object Anon_ResRules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[LifecycleRule]): Anon_ResRules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ResRules]
  }
}

