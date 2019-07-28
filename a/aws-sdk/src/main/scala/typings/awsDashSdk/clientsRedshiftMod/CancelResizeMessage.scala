package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelResizeMessage extends js.Object {
  /**
    * The unique identifier for the cluster that you want to cancel a resize operation for.
    */
  var ClusterIdentifier: String
}

object CancelResizeMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): CancelResizeMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier)
  
    __obj.asInstanceOf[CancelResizeMessage]
  }
}

