package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAttributeValue extends js.Object {
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.undefined
}

object AccountAttributeValue {
  @scala.inline
  def apply(AttributeValue: String = null): AccountAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[AccountAttributeValue]
  }
}

