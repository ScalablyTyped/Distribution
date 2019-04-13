package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDBSecurityGroupResult extends js.Object {
  var DBSecurityGroup: js.UndefOr[DBSecurityGroup] = js.undefined
}

object CreateDBSecurityGroupResult {
  @scala.inline
  def apply(DBSecurityGroup: DBSecurityGroup = null): CreateDBSecurityGroupResult = {
    val __obj = js.Dynamic.literal()
    if (DBSecurityGroup != null) __obj.updateDynamic("DBSecurityGroup")(DBSecurityGroup)
    __obj.asInstanceOf[CreateDBSecurityGroupResult]
  }
}

