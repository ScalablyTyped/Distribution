package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublicWorkforceTaskPrice extends js.Object {
  /**
    * Defines the amount of money paid to a worker in United States dollars.
    */
  var AmountInUsd: js.UndefOr[USD] = js.undefined
}

object PublicWorkforceTaskPrice {
  @scala.inline
  def apply(AmountInUsd: USD = null): PublicWorkforceTaskPrice = {
    val __obj = js.Dynamic.literal()
    if (AmountInUsd != null) __obj.updateDynamic("AmountInUsd")(AmountInUsd)
    __obj.asInstanceOf[PublicWorkforceTaskPrice]
  }
}

