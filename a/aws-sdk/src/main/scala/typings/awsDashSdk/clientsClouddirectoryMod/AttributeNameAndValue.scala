package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributeNameAndValue extends js.Object {
  /**
    * The attribute name of the typed link.
    */
  var AttributeName: typings.awsDashSdk.clientsClouddirectoryMod.AttributeName
  /**
    * The value for the typed link.
    */
  var Value: TypedAttributeValue
}

object AttributeNameAndValue {
  @scala.inline
  def apply(AttributeName: AttributeName, Value: TypedAttributeValue): AttributeNameAndValue = {
    val __obj = js.Dynamic.literal(AttributeName = AttributeName, Value = Value)
  
    __obj.asInstanceOf[AttributeNameAndValue]
  }
}

