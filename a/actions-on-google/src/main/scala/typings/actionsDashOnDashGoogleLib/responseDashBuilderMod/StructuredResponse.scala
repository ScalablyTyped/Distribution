package typings
package actionsDashOnDashGoogleLib.responseDashBuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredResponse extends js.Object {
  var orderUpdate: actionsDashOnDashGoogleLib.transactionsMod.OrderUpdate
}

object StructuredResponse {
  @scala.inline
  def apply(orderUpdate: actionsDashOnDashGoogleLib.transactionsMod.OrderUpdate): StructuredResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("orderUpdate")(orderUpdate)
    __obj.asInstanceOf[StructuredResponse]
  }
}

