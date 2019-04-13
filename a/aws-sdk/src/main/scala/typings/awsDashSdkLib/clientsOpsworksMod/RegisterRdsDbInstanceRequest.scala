package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterRdsDbInstanceRequest extends js.Object {
  /**
    * The database password.
    */
  var DbPassword: String
  /**
    * The database's master user name.
    */
  var DbUser: String
  /**
    * The Amazon RDS instance's ARN.
    */
  var RdsDbInstanceArn: String
  /**
    * The stack ID.
    */
  var StackId: String
}

object RegisterRdsDbInstanceRequest {
  @scala.inline
  def apply(DbPassword: String, DbUser: String, RdsDbInstanceArn: String, StackId: String): RegisterRdsDbInstanceRequest = {
    val __obj = js.Dynamic.literal(DbPassword = DbPassword, DbUser = DbUser, RdsDbInstanceArn = RdsDbInstanceArn, StackId = StackId)
  
    __obj.asInstanceOf[RegisterRdsDbInstanceRequest]
  }
}

