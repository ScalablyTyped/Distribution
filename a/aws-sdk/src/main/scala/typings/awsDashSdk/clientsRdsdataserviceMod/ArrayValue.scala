package typings.awsDashSdk.clientsRdsdataserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ArrayValue extends js.Object {
  /**
    * An array of arrays.
    */
  var arrayValues: js.UndefOr[ArrayOfArray] = js.native
  /**
    * An array of Boolean values.
    */
  var booleanValues: js.UndefOr[BooleanArray] = js.native
  /**
    * An array of integers.
    */
  var doubleValues: js.UndefOr[DoubleArray] = js.native
  /**
    * An array of floating point numbers.
    */
  var longValues: js.UndefOr[LongArray] = js.native
  /**
    * An array of strings.
    */
  var stringValues: js.UndefOr[StringArray] = js.native
}

object ArrayValue {
  @scala.inline
  def apply(
    arrayValues: ArrayOfArray = null,
    booleanValues: BooleanArray = null,
    doubleValues: DoubleArray = null,
    longValues: LongArray = null,
    stringValues: StringArray = null
  ): ArrayValue = {
    val __obj = js.Dynamic.literal()
    if (arrayValues != null) __obj.updateDynamic("arrayValues")(arrayValues.asInstanceOf[js.Any])
    if (booleanValues != null) __obj.updateDynamic("booleanValues")(booleanValues.asInstanceOf[js.Any])
    if (doubleValues != null) __obj.updateDynamic("doubleValues")(doubleValues.asInstanceOf[js.Any])
    if (longValues != null) __obj.updateDynamic("longValues")(longValues.asInstanceOf[js.Any])
    if (stringValues != null) __obj.updateDynamic("stringValues")(stringValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayValue]
  }
}

