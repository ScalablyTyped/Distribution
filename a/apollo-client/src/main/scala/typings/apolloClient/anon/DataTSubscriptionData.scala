package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataTSubscriptionData[TSubscriptionData] extends js.Object {
  var data: TSubscriptionData = js.native
}

object DataTSubscriptionData {
  @scala.inline
  def apply[TSubscriptionData](data: TSubscriptionData): DataTSubscriptionData[TSubscriptionData] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTSubscriptionData[TSubscriptionData]]
  }
  @scala.inline
  implicit class DataTSubscriptionDataOps[Self <: DataTSubscriptionData[_], TSubscriptionData] (val x: Self with DataTSubscriptionData[TSubscriptionData]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setData(value: TSubscriptionData): Self = this.set("data", value.asInstanceOf[js.Any])
  }
  
}

