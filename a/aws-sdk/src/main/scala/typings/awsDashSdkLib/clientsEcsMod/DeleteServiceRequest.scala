package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteServiceRequest extends js.Object {
  /**
    * The short name or full Amazon Resource Name (ARN) of the cluster that hosts the service to delete. If you do not specify a cluster, the default cluster is assumed.
    */
  var cluster: js.UndefOr[String] = js.undefined
  /**
    * If true, allows you to delete a service even if it has not been scaled down to zero tasks. It is only necessary to use this if the service is using the REPLICA scheduling strategy.
    */
  var force: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The name of the service to delete.
    */
  var service: String
}

object DeleteServiceRequest {
  @scala.inline
  def apply(service: String, cluster: String = null, force: js.UndefOr[BoxedBoolean] = js.undefined): DeleteServiceRequest = {
    val __obj = js.Dynamic.literal(service = service)
    if (cluster != null) __obj.updateDynamic("cluster")(cluster)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    __obj.asInstanceOf[DeleteServiceRequest]
  }
}

