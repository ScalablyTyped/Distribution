package typings
package aliDashOssLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acl extends js.Object {
  var acl: java.lang.String
  var res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse
}

object Anon_Acl {
  @scala.inline
  def apply(acl: java.lang.String, res: aliDashOssLib.aliDashOssMod.OSSNs.NormalSuccessResponse): Anon_Acl = {
    val __obj = js.Dynamic.literal(acl = acl, res = res)
  
    __obj.asInstanceOf[Anon_Acl]
  }
}

