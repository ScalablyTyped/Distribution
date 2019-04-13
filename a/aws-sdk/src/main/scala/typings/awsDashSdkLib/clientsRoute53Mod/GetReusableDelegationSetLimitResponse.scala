package typings
package awsDashSdkLib.clientsRoute53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetReusableDelegationSetLimitResponse extends js.Object {
  /**
    * The current number of hosted zones that you can associate with the specified reusable delegation set.
    */
  var Count: UsageCount
  /**
    * The current setting for the limit on hosted zones that you can associate with the specified reusable delegation set.
    */
  var Limit: ReusableDelegationSetLimit
}

object GetReusableDelegationSetLimitResponse {
  @scala.inline
  def apply(Count: UsageCount, Limit: ReusableDelegationSetLimit): GetReusableDelegationSetLimitResponse = {
    val __obj = js.Dynamic.literal(Count = Count, Limit = Limit)
  
    __obj.asInstanceOf[GetReusableDelegationSetLimitResponse]
  }
}

