package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRoleToDBInstanceMessage extends js.Object {
  /**
    * The name of the DB instance to associate the IAM role with.
    */
  var DBInstanceIdentifier: String
  /**
    * The name of the feature for the DB instance that the IAM role is to be associated with. For the list of supported feature names, see DBEngineVersion. 
    */
  var FeatureName: String
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the DB instance, for example arn:aws:iam::123456789012:role/AccessRole. 
    */
  var RoleArn: String
}

object AddRoleToDBInstanceMessage {
  @scala.inline
  def apply(DBInstanceIdentifier: String, FeatureName: String, RoleArn: String): AddRoleToDBInstanceMessage = {
    val __obj = js.Dynamic.literal(DBInstanceIdentifier = DBInstanceIdentifier, FeatureName = FeatureName, RoleArn = RoleArn)
  
    __obj.asInstanceOf[AddRoleToDBInstanceMessage]
  }
}

