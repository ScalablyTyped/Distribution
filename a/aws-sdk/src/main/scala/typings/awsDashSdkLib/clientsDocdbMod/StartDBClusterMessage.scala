package typings
package awsDashSdkLib.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartDBClusterMessage extends js.Object {
  /**
    * The identifier of the cluster to restart. Example: docdb-2019-05-28-15-24-52 
    */
  var DBClusterIdentifier: String
}

object StartDBClusterMessage {
  @scala.inline
  def apply(DBClusterIdentifier: String): StartDBClusterMessage = {
    val __obj = js.Dynamic.literal(DBClusterIdentifier = DBClusterIdentifier)
  
    __obj.asInstanceOf[StartDBClusterMessage]
  }
}

