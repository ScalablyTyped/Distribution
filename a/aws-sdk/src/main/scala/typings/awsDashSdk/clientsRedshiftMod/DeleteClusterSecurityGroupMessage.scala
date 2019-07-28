package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterSecurityGroupMessage extends js.Object {
  /**
    * The name of the cluster security group to be deleted.
    */
  var ClusterSecurityGroupName: String
}

object DeleteClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroupName: String): DeleteClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSecurityGroupName = ClusterSecurityGroupName)
  
    __obj.asInstanceOf[DeleteClusterSecurityGroupMessage]
  }
}

