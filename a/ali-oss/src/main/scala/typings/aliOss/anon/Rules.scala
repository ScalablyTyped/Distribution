package typings.aliOss.anon

import typings.aliOss.mod.LifecycleRule
import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[LifecycleRule]
}

object Rules {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[LifecycleRule]): Rules = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
}

