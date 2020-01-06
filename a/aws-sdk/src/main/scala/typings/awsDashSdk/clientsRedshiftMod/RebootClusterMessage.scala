package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RebootClusterMessage extends js.Object {
  /**
    * The cluster identifier.
    */
  var ClusterIdentifier: String = js.native
}

object RebootClusterMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): RebootClusterMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RebootClusterMessage]
  }
}

