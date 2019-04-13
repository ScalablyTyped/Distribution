package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAttributeUpdate extends js.Object {
  /**
    * The action to perform as part of the attribute update.
    */
  var ObjectAttributeAction: js.UndefOr[ObjectAttributeAction] = js.undefined
  /**
    * The key of the attribute being updated.
    */
  var ObjectAttributeKey: js.UndefOr[AttributeKey] = js.undefined
}

object ObjectAttributeUpdate {
  @scala.inline
  def apply(ObjectAttributeAction: ObjectAttributeAction = null, ObjectAttributeKey: AttributeKey = null): ObjectAttributeUpdate = {
    val __obj = js.Dynamic.literal()
    if (ObjectAttributeAction != null) __obj.updateDynamic("ObjectAttributeAction")(ObjectAttributeAction)
    if (ObjectAttributeKey != null) __obj.updateDynamic("ObjectAttributeKey")(ObjectAttributeKey)
    __obj.asInstanceOf[ObjectAttributeUpdate]
  }
}

