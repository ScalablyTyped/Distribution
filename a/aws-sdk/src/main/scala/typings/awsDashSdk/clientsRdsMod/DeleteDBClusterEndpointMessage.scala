package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteDBClusterEndpointMessage extends js.Object {
  /**
    * The identifier associated with the custom endpoint. This parameter is stored as a lowercase string.
    */
  var DBClusterEndpointIdentifier: String
}

object DeleteDBClusterEndpointMessage {
  @scala.inline
  def apply(DBClusterEndpointIdentifier: String): DeleteDBClusterEndpointMessage = {
    val __obj = js.Dynamic.literal(DBClusterEndpointIdentifier = DBClusterEndpointIdentifier)
  
    __obj.asInstanceOf[DeleteDBClusterEndpointMessage]
  }
}

