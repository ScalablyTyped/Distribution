package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeValue extends js.Object {
  /**
    * The attribute value. The value is case-sensitive.
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

