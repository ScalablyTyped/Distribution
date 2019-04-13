package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeKeyAndValue extends js.Object {
  /**
    * The key of the attribute.
    */
  var Key: AttributeKey
  /**
    * The value of the attribute.
    */
  var Value: TypedAttributeValue
}

object AttributeKeyAndValue {
  @scala.inline
  def apply(Key: AttributeKey, Value: TypedAttributeValue): AttributeKeyAndValue = {
    val __obj = js.Dynamic.literal(Key = Key, Value = Value)
  
    __obj.asInstanceOf[AttributeKeyAndValue]
  }
}

