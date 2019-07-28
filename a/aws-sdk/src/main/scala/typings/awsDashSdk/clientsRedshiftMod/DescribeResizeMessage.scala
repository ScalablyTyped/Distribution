package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResizeMessage extends js.Object {
  /**
    * The unique identifier of a cluster whose resize progress you are requesting. This parameter is case-sensitive. By default, resize operations for all clusters defined for an AWS account are returned.
    */
  var ClusterIdentifier: String
}

object DescribeResizeMessage {
  @scala.inline
  def apply(ClusterIdentifier: String): DescribeResizeMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier)
  
    __obj.asInstanceOf[DescribeResizeMessage]
  }
}

