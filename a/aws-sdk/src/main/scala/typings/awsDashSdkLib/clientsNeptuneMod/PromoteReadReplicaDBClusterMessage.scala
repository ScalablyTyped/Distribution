package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromoteReadReplicaDBClusterMessage extends js.Object {
  /**
    * Not supported.
    */
  var DBClusterIdentifier: String
}

object PromoteReadReplicaDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): PromoteReadReplicaDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
  
    __obj.asInstanceOf[PromoteReadReplicaDBClusterMessage]
  }
}

