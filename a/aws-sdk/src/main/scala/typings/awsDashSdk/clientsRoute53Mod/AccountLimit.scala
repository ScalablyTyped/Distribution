package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountLimit extends js.Object {
  /**
    * The limit that you requested. Valid values include the following:    MAX_HEALTH_CHECKS_BY_OWNER: The maximum number of health checks that you can create using the current account.    MAX_HOSTED_ZONES_BY_OWNER: The maximum number of hosted zones that you can create using the current account.    MAX_REUSABLE_DELEGATION_SETS_BY_OWNER: The maximum number of reusable delegation sets that you can create using the current account.    MAX_TRAFFIC_POLICIES_BY_OWNER: The maximum number of traffic policies that you can create using the current account.    MAX_TRAFFIC_POLICY_INSTANCES_BY_OWNER: The maximum number of traffic policy instances that you can create using the current account. (Traffic policy instances are referred to as traffic flow policy records in the Amazon Route 53 console.)  
    */
  var Type: AccountLimitType
  /**
    * The current value for the limit that is specified by Type.
    */
  var Value: LimitValue
}

object AccountLimit {
  @scala.inline
  def apply(Type: AccountLimitType, Value: LimitValue): AccountLimit = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[AccountLimit]
  }
}

