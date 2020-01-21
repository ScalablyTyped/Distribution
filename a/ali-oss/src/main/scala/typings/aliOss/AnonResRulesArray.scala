package typings.aliOss

import typings.aliOss.mod.CORSRule
import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResRulesArray extends js.Object {
  var res: NormalSuccessResponse
  var rules: js.Array[CORSRule]
}

object AnonResRulesArray {
  @scala.inline
  def apply(res: NormalSuccessResponse, rules: js.Array[CORSRule]): AnonResRulesArray = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResRulesArray]
  }
}

