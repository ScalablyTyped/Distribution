package typings.aliOss

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAcl extends js.Object {
  var acl: String
  var res: NormalSuccessResponse
}

object AnonAcl {
  @scala.inline
  def apply(acl: String, res: NormalSuccessResponse): AnonAcl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAcl]
  }
}

