package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAttribute extends js.Object {
  /**
    * The name of the account attribute.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  /**
    * The values for the account attribute.
    */
  var AttributeValues: js.UndefOr[AccountAttributeValueList] = js.undefined
}

object AccountAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AccountAttributeValueList = null): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues)
    __obj.asInstanceOf[AccountAttribute]
  }
}

