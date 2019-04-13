package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: js.UndefOr[String] = js.undefined
  /**
    * The master user name.
    */
  var DbUser: js.UndefOr[String] = js.undefined
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
}

object UpdateRdsDbInstanceRequest {
  @scala.inline
  def apply(RdsDbInstanceArn: String, DbPassword: String = null, DbUser: String = null): UpdateRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(RdsDbInstanceArn = RdsDbInstanceArn)
    if (DbPassword != null) __obj.updateDynamic("DbPassword")(DbPassword)
    if (DbUser != null) __obj.updateDynamic("DbUser")(DbUser)
    __obj.asInstanceOf[UpdateRdsDbInstanceRequest]
  }
}

