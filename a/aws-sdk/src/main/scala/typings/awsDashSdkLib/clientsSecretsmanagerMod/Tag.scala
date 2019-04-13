package typings
package awsDashSdkLib.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The key identifier, or name, of the tag.
    */
  var Key: js.UndefOr[TagKeyType] = js.undefined
  /**
    * The string value that's associated with the key of the tag.
    */
  var Value: js.UndefOr[TagValueType] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: TagKeyType = null, Value: TagValueType = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

