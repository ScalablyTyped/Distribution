package typings.awsDashSdk.clientsSnsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttributeValue extends js.Object {
  /**
    * Binary type attributes can store any binary data, for example, compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.undefined
  /**
    * Amazon SNS supports the following logical data types: String, String.Array, Number, and Binary. For more information, see Message Attribute Data Types.
    */
  var DataType: String
  /**
    * Strings are Unicode with UTF8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object MessageAttributeValue {
  @scala.inline
  def apply(DataType: String, BinaryValue: Binary = null, StringValue: String = null): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType)
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[MessageAttributeValue]
  }
}

