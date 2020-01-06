package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RevokeDBSecurityGroupIngressResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[typings.awsDashSdk.clientsRdsMod.DBSecurityGroup] = js.native
}

object RevokeDBSecurityGroupIngressResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): RevokeDBSecurityGroupIngressResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[RevokeDBSecurityGroupIngressResult]
  }
}

