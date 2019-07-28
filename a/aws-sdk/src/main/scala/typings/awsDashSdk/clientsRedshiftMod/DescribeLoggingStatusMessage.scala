package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoggingStatusMessage extends js.Object {
  /**
    * The identifier of the cluster from which to get the logging status. Example: examplecluster 
    */
  var ClusterIdentifier: String
}

object DescribeLoggingStatusMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DescribeLoggingStatusMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier)
  
    __obj.asInstanceOf[DescribeLoggingStatusMessage]
  }
}

