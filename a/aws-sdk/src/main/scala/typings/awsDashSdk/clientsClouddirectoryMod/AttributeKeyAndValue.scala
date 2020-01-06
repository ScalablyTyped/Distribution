package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttributeKeyAndValue extends js.Object {
  /**
    * The key of the attribute.
    */
  var Key: AttributeKey = js.native
  /**
    * The value of the attribute.
    */
  var Value: TypedAttributeValue = js.native
}

object AttributeKeyAndValue {
  @scala.inline
  def apply(Key: AttributeKey, Value: TypedAttributeValue): AttributeKeyAndValue = {
    val __obj = js.Dynamic.literal(Key = Key.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttributeKeyAndValue]
  }
}

