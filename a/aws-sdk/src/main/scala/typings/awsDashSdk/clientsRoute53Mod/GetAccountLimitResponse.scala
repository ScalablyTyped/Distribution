package typings.awsDashSdk.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetAccountLimitResponse extends js.Object {
  /**
    * The current number of entities that you have created of the specified type. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Count is the current number of health checks that you have created using the current account.
    */
  var Count: UsageCount
  /**
    * The current setting for the specified limit. For example, if you specified MAX_HEALTH_CHECKS_BY_OWNER for the value of Type in the request, the value of Limit is the maximum number of health checks that you can create using the current account.
    */
  var Limit: AccountLimit
}

object GetAccountLimitResponse {
  @scala.inline
  def apply(Count: UsageCount, Limit: AccountLimit): GetAccountLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count, Limit = Limit)
  
    __obj.asInstanceOf[GetAccountLimitResponse]
  }
}

