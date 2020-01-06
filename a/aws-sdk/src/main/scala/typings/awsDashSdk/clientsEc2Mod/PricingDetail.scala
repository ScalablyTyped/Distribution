package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PricingDetail extends js.Object {
  /**
    * The number of reservations available for the price.
    */
  var Count: js.UndefOr[Integer] = js.native
  /**
    * The price per instance.
    */
  var Price: js.UndefOr[Double] = js.native
}

object PricingDetail {
  @scala.inline
  def apply(Count: Int | scala.Double = null, Price: Int | scala.Double = null): PricingDetail = {
    val __obj = js.Dynamic.literal()
    if (Count != null) __obj.updateDynamic("Count")(Count.asInstanceOf[js.Any])
    if (Price != null) __obj.updateDynamic("Price")(Price.asInstanceOf[js.Any])
    __obj.asInstanceOf[PricingDetail]
  }
}

