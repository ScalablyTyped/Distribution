package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypedAttributeValue extends js.Object {
  /**
    * A binary data value.
    */
  var BinaryValue: js.UndefOr[BinaryAttributeValue] = js.undefined
  /**
    * A Boolean data value.
    */
  var BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined
  /**
    * A date and time value.
    */
  var DatetimeValue: js.UndefOr[DatetimeAttributeValue] = js.undefined
  /**
    * A number data value.
    */
  var NumberValue: js.UndefOr[NumberAttributeValue] = js.undefined
  /**
    * A string data value.
    */
  var StringValue: js.UndefOr[StringAttributeValue] = js.undefined
}

object TypedAttributeValue {
  @scala.inline
  def apply(
    BinaryValue: BinaryAttributeValue = null,
    BooleanValue: js.UndefOr[BooleanAttributeValue] = js.undefined,
    DatetimeValue: DatetimeAttributeValue = null,
    NumberValue: NumberAttributeValue = null,
    StringValue: StringAttributeValue = null
  ): TypedAttributeValue = {
    val __obj = js.Dynamic.literal()
    if (BinaryValue != null) __obj.updateDynamic("BinaryValue")(BinaryValue.asInstanceOf[js.Any])
    if (!js.isUndefined(BooleanValue)) __obj.updateDynamic("BooleanValue")(BooleanValue)
    if (DatetimeValue != null) __obj.updateDynamic("DatetimeValue")(DatetimeValue)
    if (NumberValue != null) __obj.updateDynamic("NumberValue")(NumberValue)
    if (StringValue != null) __obj.updateDynamic("StringValue")(StringValue)
    __obj.asInstanceOf[TypedAttributeValue]
  }
}

