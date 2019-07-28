package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveRoleFromDBClusterMessage extends js.Object {
  /**
    * The name of the DB cluster to disassociate the IAM role from.
    */
  var DBClusterIdentifier: String
  /**
    * The Amazon Resource Name (ARN) of the IAM role to disassociate from the DB cluster, for example arn:aws:iam::123456789012:role/NeptuneAccessRole.
    */
  var RoleArn: String
}

object RemoveRoleFromDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String): RemoveRoleFromDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, RoleArn = RoleArn)
  
    __obj.asInstanceOf[RemoveRoleFromDBClusterMessage]
  }
}

