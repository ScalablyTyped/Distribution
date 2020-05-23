package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: DataTSubscriptionData[TSubscriptionData]
  var variables: js.UndefOr[TSubscriptionVariables] = js.undefined
}

object SubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](
    subscriptionData: DataTSubscriptionData[TSubscriptionData],
    variables: TSubscriptionVariables = null
  ): SubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
}

