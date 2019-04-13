package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[String] = js.undefined
  /**
    * A list of attribute values.
    */
  var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
}

object AccountAttribute {
  @scala.inline
  def apply(AttributeName: String = null, AttributeValues: AttributeValueList = null): AccountAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeValues != null) __obj.updateDynamic("AttributeValues")(AttributeValues)
    __obj.asInstanceOf[AccountAttribute]
  }
}

