package typings
package awsDashSdkLib.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttribute extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[AttributeName] = js.undefined
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[AttributeValue] = js.undefined
}

object PolicyAttribute {
  @scala.inline
  def apply(AttributeName: AttributeName = null, AttributeValue: AttributeValue = null): PolicyAttribute = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[PolicyAttribute]
  }
}

