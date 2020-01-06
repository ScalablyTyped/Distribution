package typings.awsDashSdk.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeType extends js.Object {
  /**
    * The name of the attribute.
    */
  var Name: AttributeNameType = js.native
  /**
    * The value of the attribute.
    */
  var Value: js.UndefOr[AttributeValueType] = js.native
}

object AttributeType {
  @scala.inline
  def apply(Name: AttributeNameType, Value: AttributeValueType = null): AttributeType = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeType]
  }
}

