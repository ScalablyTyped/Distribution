package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RevokeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
}

object RevokeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup)
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
}

