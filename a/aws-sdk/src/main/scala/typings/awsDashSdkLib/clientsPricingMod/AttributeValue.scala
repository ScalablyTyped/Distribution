package typings
package awsDashSdkLib.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /**
    * The specific value of an attributeName.
    */
  var Value: js.UndefOr[String] = js.undefined
}

object AttributeValue {
  @scala.inline
  def apply(Value: String = null): AttributeValue = {
    val __obj = js.Dynamic.literal()
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AttributeValue]
  }
}

