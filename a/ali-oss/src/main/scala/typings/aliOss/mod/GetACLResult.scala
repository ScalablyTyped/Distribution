package typings.aliOss.mod

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
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetACLResult]
  }
}

