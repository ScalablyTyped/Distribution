package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetACLResult extends js.Object {
  var acl: ACLType
  var res: NormalSuccessResponse
}

object GetACLResult {
  @scala.inline
  def apply(acl: ACLType, res: NormalSuccessResponse): GetACLResult = {
    val __obj = js.Dynamic.literal(acl = acl, res = res)
  
    __obj.asInstanceOf[GetACLResult]
  }
}

