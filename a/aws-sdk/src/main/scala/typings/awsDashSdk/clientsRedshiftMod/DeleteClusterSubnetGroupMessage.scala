package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteClusterSubnetGroupMessage extends js.Object {
  /**
    * The name of the cluster subnet group name to be deleted.
    */
  var ClusterSubnetGroupName: String
}

object DeleteClusterSubnetGroupMessage {
  @scala.inline
  def apply(ClusterSubnetGroupName: String): DeleteClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal(ClusterSubnetGroupName = ClusterSubnetGroupName)
  
    __obj.asInstanceOf[DeleteClusterSubnetGroupMessage]
  }
}

