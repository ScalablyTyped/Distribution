package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var AttributeAction: js.UndefOr[LinkAttributeAction] = js.undefined
  /**
    * The key of the attribute being updated.
    */
  var AttributeKey: js.UndefOr[AttributeKey] = js.undefined
}

object LinkAttributeUpdate {
  @scala.inline
  def apply(AttributeAction: LinkAttributeAction = null, AttributeKey: AttributeKey = null): LinkAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    if (AttributeAction != null) __obj.updateDynamic("AttributeAction")(AttributeAction)
    if (AttributeKey != null) __obj.updateDynamic("AttributeKey")(AttributeKey)
    __obj.asInstanceOf[LinkAttributeUpdate]
  }
}

