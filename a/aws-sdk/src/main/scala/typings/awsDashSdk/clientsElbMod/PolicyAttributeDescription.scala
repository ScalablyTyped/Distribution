package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyAttributeDescription extends js.Object {
  /**
    * The name of the attribute.
    */
  var AttributeName: js.UndefOr[typings.awsDashSdk.clientsElbMod.AttributeName] = js.undefined
  /**
    * The value of the attribute.
    */
  var AttributeValue: js.UndefOr[typings.awsDashSdk.clientsElbMod.AttributeValue] = js.undefined
}

object PolicyAttributeDescription {
  @scala.inline
  def apply(AttributeName: AttributeName = null, AttributeValue: AttributeValue = null): PolicyAttributeDescription = {
    val __obj = js.Dynamic.literal()
    if (AttributeName != null) __obj.updateDynamic("AttributeName")(AttributeName)
    if (AttributeValue != null) __obj.updateDynamic("AttributeValue")(AttributeValue)
    __obj.asInstanceOf[PolicyAttributeDescription]
  }
}

