package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdditionalAttribute extends js.Object {
  /**
    * This parameter is reserved.
    */
  var Key: js.UndefOr[AdditionalAttributeKey] = js.undefined
  /**
    * This parameter is reserved.
    */
  var Value: js.UndefOr[AdditionalAttributeValue] = js.undefined
}

object AdditionalAttribute {
  @scala.inline
  def apply(Key: AdditionalAttributeKey = null, Value: AdditionalAttributeValue = null): AdditionalAttribute = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AdditionalAttribute]
  }
}

