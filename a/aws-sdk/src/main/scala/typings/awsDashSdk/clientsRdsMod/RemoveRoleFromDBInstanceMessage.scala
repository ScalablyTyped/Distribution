package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRoleFromDBInstanceMessage extends js.Object {
  /**
    * The name of the DB instance to disassociate the IAM role from.
    */
  var DBInstanceIdentifier: String
  /**
    * The name of the feature for the DB instance that the IAM role is to be disassociated from. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: String
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB instance, for example arn:aws:iam::123456789012:role/AccessRole.
    */
  var RoleArn: String
}

object RemoveRoleFromDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): RemoveRoleFromDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier, FeatureName = FeatureName, RoleArn = RoleArn)
  
    __obj.asInstanceOf[RemoveRoleFromDBInstanceMessage]
  }
}

