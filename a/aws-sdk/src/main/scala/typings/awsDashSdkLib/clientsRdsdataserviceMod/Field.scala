package typings
package awsDashSdkLib.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  /**
    * A value of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.undefined
  /**
    * A value of Boolean data type.
    */
  var booleanValue: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A value of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.undefined
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * A value of long data type.
    */
  var longValue: js.UndefOr[BoxedLong] = js.undefined
  /**
    * A value of string data type.
    */
  var stringValue: js.UndefOr[String] = js.undefined
}

object Field {
  @scala.inline
  def apply(
    blobValue: _Blob = null,
    booleanValue: js.UndefOr[BoxedBoolean] = js.undefined,
    doubleValue: js.UndefOr[BoxedDouble] = js.undefined,
    isNull: js.UndefOr[BoxedBoolean] = js.undefined,
    longValue: js.UndefOr[BoxedLong] = js.undefined,
    stringValue: String = null
  ): Field = {
    val __obj = js.Dynamic.literal()
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue)
    if (!js.isUndefined(doubleValue)) __obj.updateDynamic("doubleValue")(doubleValue)
    if (!js.isUndefined(isNull)) __obj.updateDynamic("isNull")(isNull)
    if (!js.isUndefined(longValue)) __obj.updateDynamic("longValue")(longValue)
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue)
    __obj.asInstanceOf[Field]
  }
}

