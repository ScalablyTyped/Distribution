package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttributeValue extends js.Object {
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[String] = js.native
}

object AccountAttributeValue {
  @scala.inline
  def apply(AttributeValue: String = null): AccountAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttributeValue]
  }
}

