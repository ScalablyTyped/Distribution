package typings.awsDashSdk.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageAttributeValue extends js.Object {
  /**
    * Not implemented. Reserved for future use.
    */
  var BinaryListValues: js.UndefOr[BinaryList] = js.native
  /**
    * Binary type attributes can store any binary data, such as compressed data, encrypted data, or images.
    */
  var BinaryValue: js.UndefOr[Binary] = js.native
  /**
    * Amazon SQS supports the following logical data types: String, Number, and Binary. For the Number data type, you must use StringValue. You can also append custom labels. For more information, see Amazon SQS Message Attributes in the Amazon Simple Queue Service Developer Guide.
    */
  var DataType: String = js.native
  /**
    * Not implemented. Reserved for future use.
    */
  var StringListValues: js.UndefOr[StringList] = js.native
  /**
    * Strings are Unicode with UTF-8 binary encoding. For a list of code values, see ASCII Printable Characters.
    */
  var StringValue: js.UndefOr[String] = js.native
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
    val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
    if (BinaryListValues != null) __obj.updateDynamic("BinaryListValues")(BinaryListValues.asInstanceOf[js.Any])
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (StringListValues != null) __obj.updateDynamic("StringListValues")(StringListValues.asInstanceOf[js.Any])
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageAttributeValue]
  }
}

