package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FacetAttributeUpdate extends js.Object {
  /**
    * The action to perform when updating the attribute.
    */
  var Action: js.UndefOr[UpdateActionType] = js.undefined
  /**
    * The attribute to update.
    */
  var Attribute: js.UndefOr[FacetAttribute] = js.undefined
}

object FacetAttributeUpdate {
  @scala.inline
  def apply(Action: UpdateActionType = null, Attribute: FacetAttribute = null): FacetAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Attribute != null) __obj.updateDynamic("Attribute")(Attribute)
    __obj.asInstanceOf[FacetAttributeUpdate]
  }
}

