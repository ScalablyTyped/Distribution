package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  /**
    * Arbitrarily nested arrays
    */
  var arrayValues: js.UndefOr[ArrayValues] = js.undefined
  /**
    * Long value
    */
  var bigIntValue: js.UndefOr[Long] = js.undefined
  /**
    * Bit value
    */
  var bitValue: js.UndefOr[Boolean] = js.undefined
  /**
    * Blob value
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  /**
    * Double value
    */
  var doubleValue: js.UndefOr[Double] = js.undefined
  /**
    * Integer value
    */
  var intValue: js.UndefOr[Integer] = js.undefined
  /**
    * Is column null
    */
  var isNull: js.UndefOr[Boolean] = js.undefined
  /**
    * Float value
    */
  var realValue: js.UndefOr[Float] = js.undefined
  /**
    * String value
    */
  var stringValue: js.UndefOr[String] = js.undefined
  /**
    * Struct or UDT
    */
  var structValue: js.UndefOr[StructValue] = js.undefined
}

object Value {
  @scala.inline
  def apply(
    arrayValues: ArrayValues = null,
    bigIntValue: js.UndefOr[Long] = js.undefined,
    bitValue: js.UndefOr[Boolean] = js.undefined,
    blobValue: _Blob = null,
    doubleValue: js.UndefOr[Double] = js.undefined,
    intValue: js.UndefOr[Integer] = js.undefined,
    isNull: js.UndefOr[Boolean] = js.undefined,
    realValue: js.UndefOr[Float] = js.undefined,
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

