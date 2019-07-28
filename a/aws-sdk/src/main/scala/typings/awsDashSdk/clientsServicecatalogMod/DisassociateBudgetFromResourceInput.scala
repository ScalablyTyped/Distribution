package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisassociateBudgetFromResourceInput extends js.Object {
  /**
    * The name of the budget you want to disassociate.
    */
  var BudgetName: typings.awsDashSdk.clientsServicecatalogMod.BudgetName
  /**
    * The resource identifier you want to disassociate from. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id
}

object DisassociateBudgetFromResourceInput {
  @scala.inline
  def apply(BudgetName: BudgetName, ResourceId: Id): DisassociateBudgetFromResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName, ResourceId = ResourceId)
  
    __obj.asInstanceOf[DisassociateBudgetFromResourceInput]
  }
}

