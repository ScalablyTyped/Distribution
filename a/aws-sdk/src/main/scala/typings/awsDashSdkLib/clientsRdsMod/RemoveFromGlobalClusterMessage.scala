package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemoveFromGlobalClusterMessage extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) identifying the cluster that was detached from the Aurora global database cluster. 
    */
  var DbClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  The cluster identifier to detach from the Aurora global database cluster. 
    */
  var GlobalClusterIdentifier: js.UndefOr[String] = js.undefined
}

object RemoveFromGlobalClusterMessage {
  @scala.inline
  def apply(DbClusterIdentifier: String = null, GlobalClusterIdentifier: String = null): RemoveFromGlobalClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DbClusterIdentifier != null) __obj.updateDynamic("DbClusterIdentifier")(DbClusterIdentifier)
    if (GlobalClusterIdentifier != null) __obj.updateDynamic("GlobalClusterIdentifier")(GlobalClusterIdentifier)
    __obj.asInstanceOf[RemoveFromGlobalClusterMessage]
  }
}

