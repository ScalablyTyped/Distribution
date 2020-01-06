package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAppCookieStickinessPolicyInput extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: typings.awsDashSdk.clientsElbMod.CookieName = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsDashSdk.clientsElbMod.PolicyName = js.native
}

object CreateAppCookieStickinessPolicyInput {
  @scala.inline
  def apply(CookieName: CookieName, LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateAppCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(CookieName = CookieName.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateAppCookieStickinessPolicyInput]
  }
}

