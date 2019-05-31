package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * An array of column values.
    */
  var arrayValues: js.UndefOr[ArrayValueList] = js.undefined
  /**
    * A value for a column of big integer data type.
    */
  var bigIntValue: js.UndefOr[BoxedLong] = js.undefined
  /**
    * A value for a column of BIT data type.
    */
  var bitValue: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A value for a column of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  /**
    * A value for a column of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.undefined
  /**
    * A value for a column of integer data type.
    */
  var intValue: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A value for a column of real data type.
    */
  var realValue: js.UndefOr[BoxedFloat] = js.undefined
  /**
    * A value for a column of string data type.
    */
  var stringValue: js.UndefOr[String] = js.undefined
  /**
    * A value for a column of STRUCT data type.
    */
  var structValue: js.UndefOr[StructValue] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    arrayValues: ArrayValueList = null,
    bigIntValue: js.UndefOr[BoxedLong] = js.undefined,
    bitValue: js.UndefOr[BoxedBoolean] = js.undefined,
    blobValue: _Blob = null,
    doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
    intValue: js.UndefOr[BoxedInteger] = js.undefined,
    isNull: js.UndefOr[BoxedBoolean] = js.undefined,
    realValue: js.UndefOr[BoxedFloat] = js.undefined,
    stringValue: String = null,
    structValue: StructValue = null
  ): Value = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues)
    if (!js.isUndefined(bigIntValue)) __obj.updateDynamic("bigIntValue")(bigIntValue)
    if (!js.isUndefined(bitValue)) __obj.updateDynamic("bitValue")(bitValue)
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue.asInstanceOf[js.Any])
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue)
    if (!js.isUndefined(intValue)) __obj.updateDynamic("intValue")(intValue)
    if (!js.isUndefined(isNull)) __obj.updateDynamic("isNull")(isNull)
    if (!js.isUndefined(realValue)) __obj.updateDynamic("realValue")(realValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    if (structValue != null) __obj.updateDynamic("structValue")(structValue)
    __obj.asInstanceOf[Value]
  }
}

