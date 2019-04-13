package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteGlobalClusterMessage extends js.Object {
  /**
    *  The cluster identifier of the global database cluster being deleted. 
    */
  var GlobalClusterIdentifier: String
}

object DeleteGlobalClusterMessage {
  @scala.inline
  def apply(GlobalClusterIdentifier: String): DeleteGlobalClusterMessage = {
    val __obj = js.Dynamic.literal(GlobalClusterIdentifier = GlobalClusterIdentifier)
  
    __obj.asInstanceOf[DeleteGlobalClusterMessage]
  }
}

