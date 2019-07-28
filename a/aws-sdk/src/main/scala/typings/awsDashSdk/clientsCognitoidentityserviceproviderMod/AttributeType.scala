package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeType extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: AttributeNameType
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValueType] = js.undefined
}

object AttributeType {
  @scala.inline
  def apply(Name: AttributeNameType, Value: AttributeValueType = null): AttributeType = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (Value != null) __obj.updateDynamic("Value")(Value)
    __obj.asInstanceOf[AttributeType]
  }
}

