package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedLinkFacetAttributeUpdate extends js.Object {
  /**
    * The action to perform when updating the attribute.
    */
  var Action: UpdateActionType
  /**
    * The attribute to update.
    */
  var Attribute: TypedLinkAttributeDefinition
}

object TypedLinkFacetAttributeUpdate {
  @scala.inline
  def apply(Action: UpdateActionType, Attribute: TypedLinkAttributeDefinition): TypedLinkFacetAttributeUpdate = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], Attribute = Attribute)
  
    __obj.asInstanceOf[TypedLinkFacetAttributeUpdate]
  }
}

