package typings
package awsDashSdkLib.clientsCloudfrontMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaFunctionAssociations extends js.Object {
  /**
    *  Optional: A complex type that contains LambdaFunctionAssociation items for this cache behavior. If Quantity is 0, you can omit Items.
    */
  var Items: js.UndefOr[LambdaFunctionAssociationList] = js.undefined
  /**
    * The number of Lambda function associations for this cache behavior.
    */
  var Quantity: integer
}

object LambdaFunctionAssociations {
  @scala.inline
  def apply(Quantity: integer, Items: LambdaFunctionAssociationList = null): LambdaFunctionAssociations = {
    val __obj = js.Dynamic.literal(Quantity = Quantity)
    if (Items != null) __obj.updateDynamic("Items")(Items)
    __obj.asInstanceOf[LambdaFunctionAssociations]
  }
}

