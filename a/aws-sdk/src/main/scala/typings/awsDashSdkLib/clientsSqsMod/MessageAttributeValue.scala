package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MessageAttributeValue extends js.Object {
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.undefined
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.undefined
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var DataType: String
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.undefined
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.undefined
}

object MessageAttributeValue {
  @scala.inline
  def apply(
    DataType: String,
    BinaryListValues: BinaryList = null,
    BinaryValue: Binary = null,
    StringListValues: StringList = null,
    StringValue: String = null
  ): MessageAttributeValue = {
    val __obj = js.Dynamic.literal(DataType = DataType)
    if (BinaryListValues != null) __obj.updateDynamic("BinaryListValues")(BinaryListValues)
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (StringListValues != null) __obj.updateDynamic("StringListValues")(StringListValues)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[MessageAttributeValue]
  }
}

