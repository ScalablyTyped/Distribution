package typings.atApolloReactDashCommon.libTypesTypesMod

import typings.apolloDashClient.apolloDashClientMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSubscriptionDataOptions[TData] extends js.Object {
  var client: default[js.Object]
  var subscriptionData: SubscriptionResult[TData]
}

object OnSubscriptionDataOptions {
  @scala.inline
  def apply[TData](client: default[js.Object], subscriptionData: SubscriptionResult[TData]): OnSubscriptionDataOptions[TData] = {
    val __obj = js.Dynamic.literal(client = client, subscriptionData = subscriptionData)
  
    __obj.asInstanceOf[OnSubscriptionDataOptions[TData]]
  }
}

