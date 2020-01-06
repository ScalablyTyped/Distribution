package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.native
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.native
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.native
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.native
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.native
}

object Value {
  @scala.inline
  def apply(
    arrayValues: ArrayValueList = null,
    bigIntValue: Int | Double = null,
    bitValue: js.UndefOr[scala.Boolean] = js.undefined,
    blobValue: _Blob = null,
    doubleValue: Int | Double = null,
    intValue: Int | Double = null,
    isNull: js.UndefOr[scala.Boolean] = js.undefined,
    realValue: Int | Double = null,
    stringValue: String = null,
    structValue: StructValue = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (bigIntValue != null) __obj.updateDynamic("bigIntValue")(bigIntValue.asInstanceOf[js.Any])
    if (!js.isUndefined(bitValue)) __obj.updateDynamic("bitValue")(bitValue.asInstanceOf[js.Any])
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (intValue != null) __obj.updateDynamic("intValue")(intValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isNull)) __obj.updateDynamic("isNull")(isNull.asInstanceOf[js.Any])
    if (realValue != null) __obj.updateDynamic("realValue")(realValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    if (structValue != null) __obj.updateDynamic("structValue")(structValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

