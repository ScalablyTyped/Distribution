package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccountAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[String] = js.native
  /**
    * A list of attribute values.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.native
}

object AccountAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AttributeValueList = null): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName.asInstanceOf[js.Any])
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountAttribute]
  }
}

