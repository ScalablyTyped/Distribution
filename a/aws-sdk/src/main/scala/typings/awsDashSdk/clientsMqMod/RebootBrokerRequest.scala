package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RebootBrokerRequest extends js.Object {
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: __string
}

object RebootBrokerRequest {
  @scala.inline
  def apply(BrokerId: __string): RebootBrokerRequest = {
    val __obj = js.Dynamic.literal(BrokerId = BrokerId)
  
    __obj.asInstanceOf[RebootBrokerRequest]
  }
}

