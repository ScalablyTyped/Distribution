package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAttributeAction extends js.Object {
  /**
    * A type that can be either UPDATE_OR_CREATE or DELETE.
    */
  var AttributeActionType: js.UndefOr[UpdateActionType] = js.undefined
  /**
    * The value that you want to update to.
    */
  var AttributeUpdateValue: js.UndefOr[TypedAttributeValue] = js.undefined
}

object LinkAttributeAction {
  @scala.inline
  def apply(AttributeActionType: UpdateActionType = null, AttributeUpdateValue: TypedAttributeValue = null): LinkAttributeAction = {
    val __obj = js.Dynamic.literal()
    if (AttributeActionType != null) __obj.updateDynamic("AttributeActionType")(AttributeActionType.asInstanceOf[js.Any])
    if (AttributeUpdateValue != null) __obj.updateDynamic("AttributeUpdateValue")(AttributeUpdateValue)
    __obj.asInstanceOf[LinkAttributeAction]
  }
}

