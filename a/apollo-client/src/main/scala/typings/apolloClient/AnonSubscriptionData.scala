package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables] extends js.Object {
  var subscriptionData: AnonDataTSubscriptionData[TSubscriptionData]
  var variables: js.UndefOr[TSubscriptionVariables] = js.undefined
}

object AnonSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TSubscriptionVariables](
    subscriptionData: AnonDataTSubscriptionData[TSubscriptionData],
    variables: TSubscriptionVariables = null
  ): AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables] = {
    val __obj = js.Dynamic.literal(subscriptionData = subscriptionData.asInstanceOf[js.Any])
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSubscriptionData[TSubscriptionData, TSubscriptionVariables]]
  }
}

