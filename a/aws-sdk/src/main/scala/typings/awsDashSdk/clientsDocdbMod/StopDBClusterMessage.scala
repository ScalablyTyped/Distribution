package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopDBClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to stop. Example: docdb-2019-05-28-15-24-52 
    */
  var DBClusterIdentifier: String
}

object StopDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): StopDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
  
    __obj.asInstanceOf[StopDBClusterMessage]
  }
}

