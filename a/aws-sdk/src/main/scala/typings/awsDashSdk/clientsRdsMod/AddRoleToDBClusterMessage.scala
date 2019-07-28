package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddRoleToDBClusterMessage extends js.Object {
  /**
    * The name of the DB cluster to associate the IAM role with.
    */
  var DBClusterIdentifier: String
  /**
    * The name of the feature for the DB cluster that the IAM role is to be associated with. For the list of supported feature names, see DBEngineVersion.
    */
  var FeatureName: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the IAM role to associate with the Aurora DB cluster, for example arn:aws:iam::123456789012:role/AuroraAccessRole.
    */
  var RoleArn: String
}

object AddRoleToDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String, RoleArn: String, FeatureName: String = null): AddRoleToDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier, RoleArn = RoleArn)
    if (FeatureName != null) __obj.updateDynamic("FeatureName")(FeatureName)
    __obj.asInstanceOf[AddRoleToDBClusterMessage]
  }
}

