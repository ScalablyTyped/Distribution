package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    * The on-premises instance tag filter key.
    */
  var Key: js.UndefOr[Key] = js.undefined
  /**
    * The on-premises instance tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[TagFilterType] = js.undefined
  /**
    * The on-premises instance tag filter value.
    */
  var Value: js.UndefOr[Value] = js.undefined
}

object TagFilter {
  @scala.inline
  def apply(Key: Key = null, Type: TagFilterType = null, Value: Value = null): TagFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[TagFilter]
  }
}

