package typings.aliOss.anon

import typings.aliOss.mod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Acl extends js.Object {
  var acl: String
  var res: NormalSuccessResponse
}

object Acl {
  @scala.inline
  def apply(acl: String, res: NormalSuccessResponse): Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acl]
  }
}

