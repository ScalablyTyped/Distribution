package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRoleToDBClusterMessage extends js.Object {
  /**
    * The name of the DB cluster to associate the IAM role with.
    */
  var DBClusterIdentifier: String
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the Neptune DB cluster, for example arn:aws:iam::123456789012:role/NeptuneAccessRole.
    */
  var RoleArn: String
}

object AddRoleToDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String): AddRoleToDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, RoleArn = RoleArn)
  
    __obj.asInstanceOf[AddRoleToDBClusterMessage]
  }
}

