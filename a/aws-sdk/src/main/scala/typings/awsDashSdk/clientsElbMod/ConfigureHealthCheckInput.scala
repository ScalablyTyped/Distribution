package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigureHealthCheckInput extends js.Object {
  /**
    * The configuration information.
    */
  var HealthCheck: typings.awsDashSdk.clientsElbMod.HealthCheck
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}

object ConfigureHealthCheckInput {
  @scala.inline
  def apply(HealthCheck: HealthCheck, LoadBalancerName: AccessPointName): ConfigureHealthCheckInput = {
    val __obj = js.Dynamic.literal(HealthCheck = HealthCheck, LoadBalancerName = LoadBalancerName)
  
    __obj.asInstanceOf[ConfigureHealthCheckInput]
  }
}

