package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootClusterMessage extends js.Object {
  /**
    * The cluster identifier.
    */
  var ClusterIdentifier: String
}

object RebootClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): RebootClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier)
  
    __obj.asInstanceOf[RebootClusterMessage]
  }
}

