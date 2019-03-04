package typings
package actionsDashOnDashGoogleLib.transactionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FulfillmentInfo extends js.Object {
  /** UTC timestamp of the fulfillment update as an RFC 3339 string. */
  var deliveryTime: java.lang.String
}

object FulfillmentInfo {
  @scala.inline
  def apply(deliveryTime: java.lang.String): FulfillmentInfo = {
    val __obj = js.Dynamic.literal(deliveryTime = deliveryTime)
  
    __obj.asInstanceOf[FulfillmentInfo]
  }
}

