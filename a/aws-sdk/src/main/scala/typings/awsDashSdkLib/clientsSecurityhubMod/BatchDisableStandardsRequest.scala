package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisableStandardsRequest extends js.Object {
  /**
    * The ARNS of the standards subscriptions that you want to disable.
    */
  var StandardsSubscriptionArns: awsDashSdkLib.clientsSecurityhubMod.StandardsSubscriptionArns
}

object BatchDisableStandardsRequest {
  @scala.inline
  def apply(StandardsSubscriptionArns: StandardsSubscriptionArns): BatchDisableStandardsRequest = {
    val __obj = js.Dynamic.literal(StandardsSubscriptionArns = StandardsSubscriptionArns)
  
    __obj.asInstanceOf[BatchDisableStandardsRequest]
  }
}

