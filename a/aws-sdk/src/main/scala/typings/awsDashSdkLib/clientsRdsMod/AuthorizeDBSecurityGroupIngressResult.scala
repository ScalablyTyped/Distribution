package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
}

object AuthorizeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): AuthorizeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup)
    __obj.asInstanceOf[AuthorizeDBSecurityGroupIngressResult]
  }
}

