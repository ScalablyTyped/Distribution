package typings.aliDashOss

import typings.aliDashOss.aliDashOssMod.NormalSuccessResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acl extends js.Object {
  var acl: String
  var res: NormalSuccessResponse
}

object Anon_Acl {
  @scala.inline
  def apply(acl: String, res: NormalSuccessResponse): Anon_Acl = {
    val __obj = js.Dynamic.literal(acl = acl.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Acl]
  }
}

