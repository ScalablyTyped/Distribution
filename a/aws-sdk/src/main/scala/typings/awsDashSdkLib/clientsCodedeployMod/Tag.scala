package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /**
    * The tag's key.
    */
  var Key: js.UndefOr[Key] = js.undefined
  /**
    * The tag's value.
    */
  var Value: js.UndefOr[Value] = js.undefined
}

object Tag {
  @scala.inline
  def apply(Key: Key = null, Value: Value = null): Tag = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[Tag]
  }
}

