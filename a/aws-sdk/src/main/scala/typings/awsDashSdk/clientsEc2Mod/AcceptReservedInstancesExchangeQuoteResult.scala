package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AcceptReservedInstancesExchangeQuoteResult extends js.Object {
  /**
    * The ID of the successful exchange.
    */
  var ExchangeId: js.UndefOr[String] = js.native
}

object AcceptReservedInstancesExchangeQuoteResult {
  @scala.inline
  def apply(ExchangeId: String = null): AcceptReservedInstancesExchangeQuoteResult = {
    val __obj = js.Dynamic.literal()
    if (ExchangeId != null) __obj.updateDynamic("ExchangeId")(ExchangeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptReservedInstancesExchangeQuoteResult]
  }
}

