package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBSecurityGroupMembership extends js.Object {
  /**
    * The name of the DB security group.
    */
  var DBSecurityGroupName: js.UndefOr[String] = js.undefined
  /**
    * The status of the DB security group.
    */
  var Status: js.UndefOr[String] = js.undefined
}

object DBSecurityGroupMembership {
  @scala.inline
  def apply(DBSecurityGroupName: String = null, Status: String = null): DBSecurityGroupMembership = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroupName != null) __obj.updateDynamic("DBSecurityGroupName")(DBSecurityGroupName)
    if (Status != null) __obj.updateDynamic("Status")(Status)
    __obj.asInstanceOf[DBSecurityGroupMembership]
  }
}

