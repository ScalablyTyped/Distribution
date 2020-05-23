package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTSubscriptionData[TSubscriptionData] extends js.Object {
  var data: TSubscriptionData
}

object DataTSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData](data: TSubscriptionData): DataTSubscriptionData[TSubscriptionData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTSubscriptionData[TSubscriptionData]]
  }
}

