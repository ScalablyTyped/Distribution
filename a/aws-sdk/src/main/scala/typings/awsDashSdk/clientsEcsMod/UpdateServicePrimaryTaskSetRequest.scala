package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateServicePrimaryTaskSetRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service that the task set exists in.
    */
  var cluster: String
  /**
    * The short name or full Amazon Resource Name (ARN) of the task set to set as the primary task set in the deployment.
    */
  var primaryTaskSet: String
  /**
    * The short name or full Amazon Resource Name (ARN) of the service that the task set exists in.
    */
  var service: String
}

object UpdateServicePrimaryTaskSetRequest {
  @scala.inline
  def apply(cluster: String, primaryTaskSet: String, service: String): UpdateServicePrimaryTaskSetRequest = {
    val __obj = js.Dynamic.literal(cluster = cluster, primaryTaskSet = primaryTaskSet, service = service)
  
    __obj.asInstanceOf[UpdateServicePrimaryTaskSetRequest]
  }
}

