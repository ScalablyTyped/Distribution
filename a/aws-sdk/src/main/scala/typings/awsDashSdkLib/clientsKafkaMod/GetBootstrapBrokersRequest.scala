package typings
package awsDashSdkLib.clientsKafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBootstrapBrokersRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) that uniquely identifies the cluster.
    */
  var ClusterArn: __string
}

object GetBootstrapBrokersRequest {
  @scala.inline
  def apply(ClusterArn: __string): GetBootstrapBrokersRequest = {
    val __obj = js.Dynamic.literal(ClusterArn = ClusterArn)
  
    __obj.asInstanceOf[GetBootstrapBrokersRequest]
  }
}

