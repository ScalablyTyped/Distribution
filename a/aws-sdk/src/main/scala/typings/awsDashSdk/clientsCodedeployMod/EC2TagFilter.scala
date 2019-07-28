package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2TagFilter extends js.Object {
  /**
    * The tag filter key.
    */
  var Key: js.UndefOr[typings.awsDashSdk.clientsCodedeployMod.Key] = js.undefined
  /**
    * The tag filter type:   KEY_ONLY: Key only.   VALUE_ONLY: Value only.   KEY_AND_VALUE: Key and value.  
    */
  var Type: js.UndefOr[EC2TagFilterType] = js.undefined
  /**
    * The tag filter value.
    */
  var Value: js.UndefOr[typings.awsDashSdk.clientsCodedeployMod.Value] = js.undefined
}

object EC2TagFilter {
  @scala.inline
  def apply(Key: Key = null, Type: EC2TagFilterType = null, Value: Value = null): EC2TagFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[EC2TagFilter]
  }
}

