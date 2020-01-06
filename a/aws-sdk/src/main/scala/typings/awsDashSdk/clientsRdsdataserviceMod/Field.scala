package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  /**
    * An array of values.
    */
  var arrayValue: js.UndefOr[ArrayValue] = js.native
  /**
    * A value of BLOB data type.
    */
  var blobValue: js.UndefOr[_Blob] = js.native
  /**
    * A value of Boolean data type.
    */
  var booleanValue: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value of double data type.
    */
  var doubleValue: js.UndefOr[BoxedDouble] = js.native
  /**
    * A NULL value.
    */
  var isNull: js.UndefOr[BoxedBoolean] = js.native
  /**
    * A value of long data type.
    */
  var longValue: js.UndefOr[BoxedLong] = js.native
  /**
    * A value of string data type.
    */
  var stringValue: js.UndefOr[String] = js.native
}

object Field {
  @scala.inline
  def apply(
    arrayValue: ArrayValue = null,
    blobValue: _Blob = null,
    booleanValue: js.UndefOr[scala.Boolean] = js.undefined,
    doubleValue: Int | Double = null,
    isNull: js.UndefOr[scala.Boolean] = js.undefined,
    longValue: Int | Double = null,
    stringValue: String = null
  ): Field = {
    val __obj = js.Dynamic.literal()
    if (arrayValue != null) __obj.updateDynamic("arrayValue")(arrayValue.asInstanceOf[js.Any])
    if (blobValue != null) __obj.updateDynamic("blobValue")(blobValue.asInstanceOf[js.Any])
    if (!js.isUndefined(booleanValue)) __obj.updateDynamic("booleanValue")(booleanValue.asInstanceOf[js.Any])
    if (doubleValue != null) __obj.updateDynamic("doubleValue")(doubleValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isNull)) __obj.updateDynamic("isNull")(isNull.asInstanceOf[js.Any])
    if (longValue != null) __obj.updateDynamic("longValue")(longValue.asInstanceOf[js.Any])
    if (stringValue != null) __obj.updateDynamic("stringValue")(stringValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

