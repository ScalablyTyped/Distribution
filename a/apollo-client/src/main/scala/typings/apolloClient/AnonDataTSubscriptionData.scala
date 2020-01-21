package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDataTSubscriptionData[TSubscriptionData] extends js.Object {
  var data: TSubscriptionData
}

object AnonDataTSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData](data: TSubscriptionData): AnonDataTSubscriptionData[TSubscriptionData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDataTSubscriptionData[TSubscriptionData]]
  }
}

