package typings
package awsDashSdkLib.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupDefinition extends js.Object {
  /**
    * The string that represents a key for a specified group.
    */
  var Key: js.UndefOr[GroupDefinitionKey] = js.undefined
  /**
    * The string that represents the type of group.
    */
  var Type: js.UndefOr[GroupDefinitionType] = js.undefined
}

object GroupDefinition {
  @scala.inline
  def apply(Key: GroupDefinitionKey = null, Type: GroupDefinitionType = null): GroupDefinition = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupDefinition]
  }
}

