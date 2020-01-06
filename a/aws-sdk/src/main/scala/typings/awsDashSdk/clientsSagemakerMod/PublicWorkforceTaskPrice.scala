package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicWorkforceTaskPrice extends js.Object {
  /**
    * Defines the amount of money paid to an Amazon Mechanical Turk worker in United States dollars.
    */
  var AmountInUsd: js.UndefOr[USD] = js.native
}

object PublicWorkforceTaskPrice {
  @scala.inline
  def apply(AmountInUsd: USD = null): PublicWorkforceTaskPrice = {
    val __obj = js.Dynamic.literal()
    if (AmountInUsd != null) __obj.updateDynamic("AmountInUsd")(AmountInUsd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicWorkforceTaskPrice]
  }
}

