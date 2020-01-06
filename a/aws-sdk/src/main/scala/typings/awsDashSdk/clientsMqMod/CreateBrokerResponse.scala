package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBrokerResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[__string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.native
}

object CreateBrokerResponse {
  @scala.inline
  def apply(BrokerArn: __string = null, BrokerId: __string = null): CreateBrokerResponse = {
    val __obj = js.Dynamic.literal()
    if (BrokerArn != null) __obj.updateDynamic("BrokerArn")(BrokerArn.asInstanceOf[js.Any])
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBrokerResponse]
  }
}

