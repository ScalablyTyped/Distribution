package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAppCookieStickinessPolicyInput extends js.Object {
  /**
    * The name of the application cookie used for stickiness.
    */
  var CookieName: awsDashSdkLib.clientsElbMod.CookieName
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
  /**
    * The name of the policy being created. Policy names must consist of alphanumeric characters and dashes (-). This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: awsDashSdkLib.clientsElbMod.PolicyName
}

object CreateAppCookieStickinessPolicyInput {
  @scala.inline
  def apply(CookieName: CookieName, LoadBalancerName: AccessPointName, PolicyName: PolicyName): CreateAppCookieStickinessPolicyInput = {
    val __obj = js.Dynamic.literal(CookieName = CookieName, LoadBalancerName = LoadBalancerName, PolicyName = PolicyName)
  
    __obj.asInstanceOf[CreateAppCookieStickinessPolicyInput]
  }
}

