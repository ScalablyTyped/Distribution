package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.CORSRule
import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResRulesArray extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[CORSRule]
}

object Anon_ResRulesArray {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[CORSRule]): Anon_ResRulesArray = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ResRulesArray]
  }
}

