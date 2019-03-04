package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResRulesArray extends js.Object {
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
  var rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.CORSRule]
}

object Anon_ResRulesArray {
  @scala.inline
  def apply(
    res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse,
    rules: js.Array[aliDashOssLib.aliDashOssMod.OSSNs.CORSRule]
  ): Anon_ResRulesArray = {
    val __obj = js.Dynamic.literal(res = res, rules = rules)
  
    __obj.asInstanceOf[Anon_ResRulesArray]
  }
}

