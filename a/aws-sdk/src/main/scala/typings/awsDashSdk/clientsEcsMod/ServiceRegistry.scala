package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceRegistry extends js.Object {
  /**
    * The container name value, already specified in the task definition, to be used for your service discovery service. If the task definition that your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition that your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
    */
  var containerName: js.UndefOr[String] = js.undefined
  /**
    * The port value, already specified in the task definition, to be used for your service discovery service. If the task definition your service task specifies uses the bridge or host network mode, you must specify a containerName and containerPort combination from the task definition. If the task definition your service task specifies uses the awsvpc network mode and a type SRV DNS record is used, you must specify either a containerName and containerPort combination or a port value, but not both.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The port value used if your service discovery service specified an SRV record. This field may be used if both the awsvpc network mode and SRV records are used.
    */
  var port: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the service registry. The currently supported service registry is AWS Cloud Map. For more information, see CreateService.
    */
  var registryArn: js.UndefOr[String] = js.undefined
}

object ServiceRegistry {
  @scala.inline
  def apply(
    containerName: String = null,
    containerPort: Int | scala.Double = null,
    port: Int | scala.Double = null,
    registryArn: String = null
  ): ServiceRegistry = {
    val __obj = js.Dynamic.literal()
    if (containerName != null) __obj.updateDynamic("containerName")(containerName)
    if (containerPort != null) __obj.updateDynamic("containerPort")(containerPort.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (registryArn != null) __obj.updateDynamic("registryArn")(registryArn)
    __obj.asInstanceOf[ServiceRegistry]
  }
}

