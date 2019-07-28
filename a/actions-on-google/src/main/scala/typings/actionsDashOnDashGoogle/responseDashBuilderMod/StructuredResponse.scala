package typings.actionsDashOnDashGoogle.responseDashBuilderMod

import typings.actionsDashOnDashGoogle.transactionsMod.OrderUpdate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StructuredResponse extends js.Object {
  var orderUpdate: OrderUpdate
}

object StructuredResponse {
  @scala.inline
  def apply(orderUpdate: OrderUpdate): StructuredResponse = {
    val __obj = js.Dynamic.literal(orderUpdate = orderUpdate)
  
    __obj.asInstanceOf[StructuredResponse]
  }
}

