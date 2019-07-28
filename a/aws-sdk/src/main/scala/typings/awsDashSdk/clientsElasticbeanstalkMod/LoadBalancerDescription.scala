package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadBalancerDescription extends js.Object {
  /**
    * The domain name of the LoadBalancer.
    */
  var Domain: js.UndefOr[String] = js.undefined
  /**
    * A list of Listeners used by the LoadBalancer.
    */
  var Listeners: js.UndefOr[LoadBalancerListenersDescription] = js.undefined
  /**
    * The name of the LoadBalancer.
    */
  var LoadBalancerName: js.UndefOr[String] = js.undefined
}

object LoadBalancerDescription {
  @scala.inline
  def apply(
    Domain: String = null,
    Listeners: LoadBalancerListenersDescription = null,
    LoadBalancerName: String = null
  ): LoadBalancerDescription = {
    val __obj = js.Dynamic.literal()
    if (Domain != null) __obj.updateDynamic("Domain")(Domain)
    if (Listeners != null) __obj.updateDynamic("Listeners")(Listeners)
    if (LoadBalancerName != null) __obj.updateDynamic("LoadBalancerName")(LoadBalancerName)
    __obj.asInstanceOf[LoadBalancerDescription]
  }
}

