package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubscriptionData[TSubscriptionData, TVariables] extends js.Object {
  var subscriptionData: Anon_DataTSubscriptionData[TSubscriptionData]
  var variables: js.UndefOr[TVariables] = js.undefined
}

object Anon_SubscriptionData {
  @scala.inline
  def apply[TSubscriptionData, TVariables](subscriptionData: Anon_DataTSubscriptionData[TSubscriptionData], variables: TVariables = null): Anon_SubscriptionData[TSubscriptionData, TVariables] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subscriptionData")(subscriptionData)
    if (variables != null) __obj.updateDynamic("variables")(variables.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SubscriptionData[TSubscriptionData, TVariables]]
  }
}

