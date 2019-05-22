package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: Anon_DataTSubscriptionData[TSubscriptionData]
  var variables: js.UndefOr[TSubscriptionVariables] = js.undefined
}

object Anon_SubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](
    subscriptionData: Anon_DataTSubscriptionData[TSubscriptionData],
    variables: TSubscriptionVariables = null
  ): Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
}

