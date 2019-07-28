package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvironmentResourcesDescription extends js.Object {
  /**
    * Describes the LoadBalancer.
    */
  var LoadBalancer: js.UndefOr[LoadBalancerDescription] = js.undefined
}

object EnvironmentResourcesDescription {
  @scala.inline
  def apply(LoadBalancer: LoadBalancerDescription = null): EnvironmentResourcesDescription = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancer != null) __obj.updateDynamic("LoadBalancer")(LoadBalancer)
    __obj.asInstanceOf[EnvironmentResourcesDescription]
  }
}

