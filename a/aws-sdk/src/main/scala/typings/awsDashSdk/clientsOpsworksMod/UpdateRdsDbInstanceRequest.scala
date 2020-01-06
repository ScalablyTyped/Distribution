package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.native
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.native
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String = js.native
}

object UpdateRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String, DbPassword: String = null, DbUser: String = null): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn.asInstanceOf[js.Any])
    if (DbPassword != null) __obj.updateDynamic("DbPassword")(DbPassword.asInstanceOf[js.Any])
    if (DbUser != null) __obj.updateDynamic("DbUser")(DbUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
}

