package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateBudgetWithResourceInput extends js.Object {
  /**
    * The name of the budget you want to associate.
    */
  var BudgetName: awsDashSdkLib.clientsServicecatalogMod.BudgetName
  /**
    *  The resource identifier. Either a portfolio-id or a product-id.
    */
  var ResourceId: Id
}

object AssociateBudgetWithResourceInput {
  @scala.inline
  def apply(BudgetName: BudgetName, ResourceId: Id): AssociateBudgetWithResourceInput = {
    val __obj = js.Dynamic.literal(BudgetName = BudgetName, ResourceId = ResourceId)
  
    __obj.asInstanceOf[AssociateBudgetWithResourceInput]
  }
}

