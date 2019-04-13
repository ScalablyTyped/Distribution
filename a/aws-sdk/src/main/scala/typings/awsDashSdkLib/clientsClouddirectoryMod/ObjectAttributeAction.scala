package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAttributeAction extends js.Object {
  /**
    * A type that can be either Update or Delete.
    */
  var ObjectAttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
  /**
    * The value that you want to update to.
    */
  var ObjectAttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
}

object ObjectAttributeAction {
  @scala.inline
  def apply(
    ObjectAttributeActionType: UpdateActionType = null,
    ObjectAttributeUpdateValue: TypedAttributeValue = null
  ): ObjectAttributeAction = {
    val __obj = js.Dynamic.literal()
    if (ObjectAttributeActionType != null) __obj.updateDynamic("ObjectAttributeActionType")(ObjectAttributeActionType.asInstanceOf[js.Any])
    if (ObjectAttributeUpdateValue != null) __obj.updateDynamic("ObjectAttributeUpdateValue")(ObjectAttributeUpdateValue)
    __obj.asInstanceOf[ObjectAttributeAction]
  }
}

