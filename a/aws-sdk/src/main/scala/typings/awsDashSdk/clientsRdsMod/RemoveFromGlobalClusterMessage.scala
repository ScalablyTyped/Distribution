package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveFromGlobalClusterMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.native
  /**
    *  The cluster identifier to detach from the Aurora global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.native
}

object RemoveFromGlobalClusterMessage {
  @scala.inline
  def apply(DbClusterIdentifier: String = null, GlobalClusterIdentifier: String = null): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DbClusterIdentifier != null) __obj.updateDynamic("DbClusterIdentifier")(DbClusterIdentifier.asInstanceOf[js.Any])
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
}

