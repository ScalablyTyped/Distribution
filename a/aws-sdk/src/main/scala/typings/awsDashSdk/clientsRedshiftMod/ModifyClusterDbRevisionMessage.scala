package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyClusterDbRevisionMessage extends js.Object {
  /**
    * The unique identifier of a cluster whose database revision you want to modify.  Example: examplecluster 
    */
  var ClusterIdentifier: String
  /**
    * The identifier of the database revision. You can retrieve this value from the response to the DescribeClusterDbRevisions request.
    */
  var RevisionTarget: String
}

object ModifyClusterDbRevisionMessage {
  @scala.inline
  def apply(ClusterIdentifier: String, RevisionTarget: String): ModifyClusterDbRevisionMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier, RevisionTarget = RevisionTarget)
  
    __obj.asInstanceOf[ModifyClusterDbRevisionMessage]
  }
}

